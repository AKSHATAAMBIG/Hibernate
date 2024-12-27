package com.test;

import com.utility.Utility;
import org.hibernate.SessionFactory;

public class Test {
    public static void main(String[] args) {

        SessionFactory sessionFactory1 = Utility.getSessionFactory();

        SessionFactory sessionFactory2 = Utility.getSessionFactory();

        if(sessionFactory1 == sessionFactory2){
            System.out.println("session factory object are same");
        }

        System.out.println(sessionFactory1+ " "+sessionFactory2);

    }
}
