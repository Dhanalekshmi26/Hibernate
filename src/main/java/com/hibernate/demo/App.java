package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Scanner scanner = new Scanner(System.in);

        try (factory) {
            Session session = factory.getCurrentSession();

            System.out.print("How many employees do you want to add? ");
            int count = Integer.parseInt(scanner.nextLine());

            session.beginTransaction();

            for (int i = 1; i <= count; i++) {
                System.out.println("\nEnter details for employee " + i + ":");

                System.out.print("First name: ");
                String firstName = scanner.nextLine();

                System.out.print("Last name: ");
                String lastName = scanner.nextLine();

                System.out.print("Gmail: ");
                String gmail = scanner.nextLine().toLowerCase(); // Ensure lowercase email

                Employee emp = new Employee(firstName, lastName, gmail);
                session.save(emp);
            }

            session.getTransaction().commit();
            System.out.println("\nAll employee records inserted successfully!");

            // Ask user if they want to delete any record
            System.out.print("\nDo you want to delete any employee? (yes/no): ");
            String deleteChoice = scanner.nextLine().trim().toLowerCase();

            if (deleteChoice.equals("yes")) {
                System.out.print("Enter the Gmail of the employee to delete: ");
                String gmailToDelete = scanner.nextLine().toLowerCase();

                session = factory.getCurrentSession();
                session.beginTransaction();

                // Find employee by email
                String hql = "from Employee e where e.gmail = :gmail";
                List<Employee> result = session.createQuery(hql, Employee.class)
                        .setParameter("gmail", gmailToDelete)
                        .getResultList();

                if (!result.isEmpty()) {
                    for (Employee emp : result) {
                        session.delete(emp);
                    }
                    session.getTransaction().commit();
                    System.out.println("Employee with gmail " + gmailToDelete + " deleted.");
                } else {
                    System.out.println("No employee found with that gmail.");
                    session.getTransaction().rollback();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
