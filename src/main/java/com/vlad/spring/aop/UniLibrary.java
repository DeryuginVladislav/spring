package com.vlad.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("UniLibrary: берем книгу ");
        System.out.println("---------------------------------");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("UniLibrary: возвращаем книгу");
        return "Война и мир";
    }

    public void getMagazine() {
        System.out.println("UniLibrary: берем журнал");
        System.out.println("---------------------------------");
    }


    public void returnMagazine() {
        System.out.println("UniLibrary: возвращаем журнал");
        System.out.println("---------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("UniLibrary: добавляем книгу ");
        System.out.println("---------------------------------");
    }

    public void addMagazine() {
        System.out.println("UniLibrary: добавляем журнал ");
        System.out.println("---------------------------------");
    }
}
