
package com.example.hibernate.util;

import com.example.hibernate.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        User user = new User();
        user.setId(1L);
        user.setName("Hibernate User");
        session.save(user);

        session.getTransaction().commit();
        session.close();
    }
}
