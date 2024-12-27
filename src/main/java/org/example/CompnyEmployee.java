package org.example;

import com.entity.Employee1;
import com.entity.Song1;
import com.entity.Student;
import com.utility.Utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CompnyEmployee {
    public static void main(String[] args) {

        SessionFactory sessionFactory = Utility.getSessionFactory();
        if(sessionFactory!= null) {

            Session session = sessionFactory.openSession();
            Employee1 emp1 = new Employee1(101, "aksj");
            session.beginTransaction();
            session.save(emp1);
            session.getTransaction().commit();
            session.close();

            session.beginTransaction();
            session.get(Student.class,101);
            session.getTransaction().commit();
            session.close();
        }
    }
}
