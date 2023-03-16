package com.example.books;


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
	public static SessionFactory getConfiguration() {
		SessionFactory sf =new Configuration().configure().addAnnotatedClass(Book.class).buildSessionFactory();
		return sf;
	}
	public static void create_book(Session ss,Transaction t) {
		List<Book> book_list = new ArrayList();
		book_list.add(new Book("Book1",500,"author1","Available"));
		book_list.add(new Book("Book2",300,"author2","Available"));
		book_list.add(new Book("Book3",500,"author3","Available"));
		book_list.add(new Book("Book4",1000,"author4","Not Available"));
		book_list.add(new Book("Book5",800,"author5","Not Available"));
		for(Book books:book_list) {
			ss.save(books);
		}
		t.commit();
	}
	public static void get_books(Session ss,Transaction t) {
		Query query = ss.createQuery("from Book");
		List<Book> books = query.list();
		for(Book getbooks:books) {
			System.out.println("Book id: "+getbooks.getBook_id()+" Book Name: "+getbooks.getBook_name()+" Book price: "+getbooks.getBook_price()+" Author Name: "+getbooks.getAuthor_name()+" Library Name: "+getbooks.getLibrary_name()+" Availability: "+getbooks.getAvailability());
		}
	}
	public static void update_books(Session ss,Transaction t) {
		t.begin();
		Book update_book =ss.find(Book.class,1);
		update_book.setBook_name("Wings Of Fire");
		ss.save(update_book);
		t.commit();
	}
	public static void delete_book(Session ss, Transaction t) {
		t.begin();
		Book delete_book =ss.find(Book.class, 2);
		ss.delete(delete_book);
		t.commit();
	}
    public static void main( String[] args )
    {
        SessionFactory sf =getConfiguration();
        Session ss =sf.openSession();
        Transaction t =ss.beginTransaction();
        create_book(ss, t);
        
        update_books(ss, t);
        delete_book(ss, t);
        get_books(ss, t);
        System.out.println(" DOne ");
    }
}
