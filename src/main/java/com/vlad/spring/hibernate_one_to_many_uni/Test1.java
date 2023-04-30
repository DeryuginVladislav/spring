package com.vlad.spring.hibernate_one_to_many_uni;

import com.vlad.spring.hibernate_one_to_many_uni.entity.Department;
import com.vlad.spring.hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()) {
//            Session session = factory.getCurrentSession();
//
//            Department dep = new Department("HR", 500, 1500);
//            Employee emp1 = new Employee("Oleg", "Ivanov", 800);
//            Employee emp2 = new Employee("Andrey", "Sidorov", 1000);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();


//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//            System.out.println(department.getEmps());
//
//
//            session.getTransaction().commit();


//            Session session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getDepartment());
//
//
//            session.getTransaction().commit();


            Session session = factory.getCurrentSession();

            session.beginTransaction();
            Department department = session.get(Department.class, 2);
            session.delete(department);


            session.getTransaction().commit();


        }
    }
}
