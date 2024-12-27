package com.utility;

import com.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {

    //Singleton design pattern
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        try {
            if (sessionFactory == null) {

                Configuration configuration = new Configuration();
                configuration.configure("hibernate.cfg.xml");
                configuration.addAnnotatedClass(Song1.class);
                configuration.addAnnotatedClass(Student.class);
                configuration.addAnnotatedClass(Laptop.class);
               // configuration.addAnnotatedClass(Employee.class);
                configuration.addAnnotatedClass(Customer.class);
                configuration.addAnnotatedClass(Employee1.class);


                //create the session factory to get the session.And session factory build it from the xml
                sessionFactory = configuration.buildSessionFactory();
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("session factory object not created");
        }
        return sessionFactory;
    }
}
