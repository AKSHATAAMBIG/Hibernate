package org.example;

import com.entity.Employee;
import com.entity.Laptop;
import com.utility.Utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Emp_LaptopCreation {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Utility.getSessionFactory();
        if (sessionFactory != null) {

            Laptop laptop = new Laptop();
            laptop.setLapId(1);
            laptop.setLapName("hp");

            Employee emp = new Employee();
            emp.setEmpId(101);
            emp.setEmpName("aaabbb");
            emp.setEmpSal(1002.0f);
            //emp.setLaptop(laptop);//one to one
            //emp.getLaptop().add(laptop);//one to many
            laptop.getEmployee1().add(emp);

            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(emp);
            session.save(laptop);
            session.getTransaction().commit();
            session.close();


        }

    }
}
