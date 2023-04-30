package com.vlad.spring.aop.aspects;

import com.vlad.spring.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* com.vlad.spring.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void com.vlad.spring.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazine() {
//    }
//
//    @Before("allMethodsExceptReturnMagazine()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10 ");
//    }

//    @Pointcut("execution(public void com.vlad.spring.aop.UniLibrary.get*())")
//    private void getMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void com.vlad.spring.aop.UniLibrary.return*())")
//    private void returnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("getMethodsFromUniLibrary() || returnMethodsFromUniLibrary()")
//    private void getAndReturnMethodsFromUniLibrary() {
//
//    }
//
//    @Before("getMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("returnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("getAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }


    @Before("com.vlad.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeGetLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object argument : arguments) {
                if (argument instanceof Book) {
                    Book myBook = (Book) argument;
                    System.out.println("Информация о книге: название - " + myBook.getName() + ", автор - " + myBook.getAuthor() +
                            ", год публикации - " + myBook.getYearOfPublication());
                } else if (argument instanceof String) {
                    System.out.println("книгу добавляет " + argument);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.println("---------------------------------");
    }
}
