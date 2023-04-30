package com.vlad.spring.hibernate_one_to_one;

import com.vlad.spring.hibernate_one_to_one.entity.Detail;
import com.vlad.spring.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
//        try (SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .addAnnotatedClass(Detail.class)
//                .buildSessionFactory()) {
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Vlad", "Deryugin", "IT", 600);
//            Detail detail = new Detail("Vladimir", "89290309687", "vladderugin4@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//        }

//        try (SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .addAnnotatedClass(Detail.class)
//                .buildSessionFactory()) {
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Moscow", "89290309587", "olejka@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//        }
//        try (SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .addAnnotatedClass(Detail.class)
//                .buildSessionFactory();
//             Session session = factory.getCurrentSession()) {
//
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail());
//
//            session.getTransaction().commit();
//        }

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
        }
    }
}
