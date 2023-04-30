package com.vlad.spring.hibernate_one_to_one;

import com.vlad.spring.hibernate_one_to_one.entity.Detail;
import com.vlad.spring.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Nikolay", "Ivanov", "HR", 850);
//            Detail empDetail = new Detail("NewYork", "287342301273", "nikolay@vk.com");
//
//            employee.setEmpDetail(empDetail);
//            empDetail.setEmployee(employee);
//
//            session.beginTransaction();
//            session.save(empDetail);

//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail.getEmployee());
//            session.getTransaction().commit();

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            session.getTransaction().commit();


        }
    }
}
