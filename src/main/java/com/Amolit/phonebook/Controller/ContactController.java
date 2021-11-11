package com.Amolit.phonebook.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Amolit.phonebook.entity.Contact;
import com.Amolit.phonebook.service.ContactServiceImpl;

@Controller
public class ContactController {

	@Autowired
	private ContactServiceImpl contactServiceImpl;
	
	@RequestMapping("/savecontact")
	public String saveContact(@RequestBody Contact contact, Model model ) {
		boolean status= contactServiceImpl.saveContact(contact);
		if(status) {
			model.addAttribute("msg", "Contact Saved Successfully");
			return "saved";
		}
		return "save again";
		
	}
	
	@RequestMapping("/getallcontact")
	public String getAllContact(Model model) {
	List<Contact> contact=	contactServiceImpl.getAllContact();
	model.addAttribute("msg", contact);
	
		return "allcontact";
		
	}
	
	@RequestMapping("/getcontactbyid/{contactid}")
	public String getContactById(@PathVariable int contactId, Model model) {
		Contact contact=contactServiceImpl.getContactById(contactId);
		model.addAttribute("msg", contact);
		return "singlecontact";
		
	}
	
	@RequestMapping("/deletecontactbyid/{contactid}")
	public String deleteById(@PathVariable int contactId, Model model) {
		boolean status =contactServiceImpl.deleteContactById(contactId);
		if(status) {
			model.addAttribute("msg", "Contact Deleted successfully");
			return "delete";
		}
		return "Not deleted";
	}
}
