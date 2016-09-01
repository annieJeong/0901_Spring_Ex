package kr.or.kosta.contact.service;

import java.util.ArrayList;
import java.util.List;

import kr.or.kosta.contact.model.Contact;

public interface ContactService {
	void registContact(Contact ct);
	Contact searchContactById(int id);
	List<Contact> getAllContacts();
}
