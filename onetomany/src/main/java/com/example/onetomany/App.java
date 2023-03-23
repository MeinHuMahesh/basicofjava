package com.example.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;







/**
 * Hello world!
 *
 */
public class App 
{
	public static SessionFactory getConfig() {
		Configuration conf = new Configuration().configure().addAnnotatedClass(Teachers.class);
		SessionFactory sf = conf.buildSessionFactory();
		return sf;
	}
	
    public static void main( String[] args )
    {	
    	
    	SessionFactory sf =getConfig();
		Session ss = sf.openSession();
		Transaction t =ss.beginTransaction();
		createTeachers(ss, t);
		createCourses(ss, t);
        System.out.println( "Hello World!" );
    }

	public static void createTeachers(Session ss, Transaction t) {
		// TODO Auto-generated method stub
		
		Query query =ss.createQuery("from Courses");
		List<Courses> courses=query.list();
		Teachers teacher =new Teachers( 1,"Mrunali", courses);
		ss.save(teacher);
		t.commit();
	}

	private static void createCourses(Session ss, Transaction t) {
		// TODO Auto-generated method stub
		t.begin();
		List<Courses> courses =new ArrayList<>();
		courses.add(new Courses(1,"Java Programming"));
		courses.add(new Courses(2,"Python Programming"));
		courses.add(new Courses(3, "Angular Programming"));
		for(Courses course:courses) {
			ss.save(course);
		}
		t.commit();
	}
}
