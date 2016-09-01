package kr.or.kosta.contact.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.contact.model.Contact;

/**
 * contacts 테이블로 데이터를 조작하는 메소드위치.
 * C .. insert data
 * R .. read data
 * U .. data update
 * D .. delete Data
 * @author kosta
 *
 */

@Repository("contactsDao")
public class ContactDao {
	
	@Autowired
	private DataSource dataSource;
	public void insertContact(Contact contact){
		
		Connection conn = null;
		try{
			conn = dataSource.getConnection();
			System.out.println("connection borrowed...");
			
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				conn.close();
				System.out.println("connection released..");
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}
	public Contact selectContactById(int id){
		System.out.println("search ok..");
		Contact contact = new Contact();
		contact.setId(1);
		contact.setName("Jeong");
		contact.setEmail("inu@open.net");
		contact.setAge(23);
		contact.setAddr("kumhodong");
		
		return contact;
	}
	public List<Contact> selectAll(){
List<Contact> contactList = new ArrayList<Contact>();
		
		Contact contact = new Contact();
		contact.setId(1);
		contact.setName("Jeong");
		contact.setEmail("inu@open.net");
		contact.setAge(23);
		contact.setAddr("kumhodong");
		contactList.add(contact);
		
		Contact contact2 = new Contact();
		contact2.setId(2);
		contact2.setName("in");
		contact2.setEmail("jiw@open.net");
		contact2.setAge(24);
		contact2.setAddr("byucksan");
		contactList.add(contact2);
		
		Contact contact3 = new Contact();
		contact3.setId(3);
		contact3.setName("woo");
		contact3.setEmail("goor14@naver.com");
		contact3.setAge(25);
		contact3.setAddr("haengdang");
		contactList.add(contact3);
		return contactList;
	}
}
