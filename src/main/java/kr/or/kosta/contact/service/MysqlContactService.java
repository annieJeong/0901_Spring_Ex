package kr.or.kosta.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import kr.or.kosta.contact.dao.ContactDao;
import kr.or.kosta.contact.model.Contact;

@Service("contactService")
@Scope("prototype")
public class MysqlContactService implements ContactService {

	@Autowired
	private ContactDao contactsdao;
	
	@Override
	public void registContact(Contact ct) {
		contactsdao.insertContact(ct);
	}

	@Override
	public Contact searchContactById(int id) {
		return contactsdao.selectContactById(id);
	}

	@Override
	public List<Contact> getAllContacts() {
		return contactsdao.selectAll();
	}

}
