package com.vlad.spring.hibernate_many_to_many;

import com.vlad.spring.hibernate_many_to_many.entity.Child;
import com.vlad.spring.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {
//            Section section1 = new Section("Dance");
//
//            Child child1 = new Child("Olya", 12);
//            Child child2 = new Child("Grisha", 8);
//            Child child3 = new Child("Pavel", 9);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            ******************************************************
//            Section section1 = new Section("Valleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//
//            Child child = new Child("Igor", 10);
//
//            child.addSection(section1);
//            child.addSection(section2);
//            child.addSection(section3);
//
//            session.beginTransaction();
//
//            session.save(child);
//
//            session.getTransaction().commit();
//            ******************************************************
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            ******************************************************
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            ******************************************************
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 7);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            ******************************************************
            session.beginTransaction();

            Child child = session.get(Child.class, 5);
            session.delete(child);

            session.getTransaction().commit();

        }

    }
}

