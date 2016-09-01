package kr.or.kosta.contact;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.kosta.contact.model.Contact;
import kr.or.kosta.contact.service.MysqlContactService;

public class ContactMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		MysqlContactService service = context.getBean("contactService",MysqlContactService.class);
		
		service.registContact(new Contact());
		
		Contact contact = service.searchContactById(1);
		System.out.println(contact);
		
		List<Contact> list = service.getAllContacts();
		
		for(Contact item:list){
			System.out.println(item);
		}
	}

}
