package com.Amolit.phonebook.service;

import java.util.List;

import com.Amolit.phonebook.entity.Contact;

public interface ContactServiceI {

	boolean saveContact(Contact contact);
	List<Contact> getAllContact();
	Contact getContactById(int contactId);
	boolean deleteContactById(int contactId);
}
