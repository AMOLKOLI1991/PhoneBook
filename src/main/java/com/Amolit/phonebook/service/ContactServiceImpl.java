package com.Amolit.phonebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Amolit.phonebook.Repository.ContactRepository;
import com.Amolit.phonebook.entity.Contact;

@Service
public class ContactServiceImpl implements ContactServiceI{

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public boolean saveContact(Contact contact) {
	Contact save=	contactRepository.save(contact);
	if(save !=null )  // && save.getContactId() != null
	{
		return true;
	}
		return false;
	}

	@Override
	public List<Contact> getAllContact() {
	List<Contact> findAll=	contactRepository.findAll();
		return findAll;
	}

	@Override
	public Contact getContactById(int contactId) {
	Optional<Contact> findById=	contactRepository.findById(contactId);
	if(findById.isPresent()) {
		Contact contact = findById.get();
		return contact;
	}
		return null;
	}

	@Override
	public boolean deleteContactById(int contactId) {
		boolean status =contactRepository.existsById(contactId);
		if(status) {
			contactRepository.deleteById(contactId);
		}
		return false;
	}

}
