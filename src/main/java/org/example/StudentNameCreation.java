package org.example;

import com.entity.Student;
import com.entity.StudentName;
import com.utility.Utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentNameCreation {
    public static void main(String[] args) {

        SessionFactory sessionFactory = Utility.getSessionFactory();
        if(sessionFactory != null) {
            Session session = sessionFactory.openSession();
            StudentName sname = new StudentName();
            sname.setFirstName("asha1111");
            sname.setLastName("ammmbig11");
            sname.setmName("nnnccnfff");

            Student student = new Student();
            student.setStudentId(105);
            student.setStudentName(sname);
            student.setStudentAge(25);

            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
            session.close();
        }

    }

}
