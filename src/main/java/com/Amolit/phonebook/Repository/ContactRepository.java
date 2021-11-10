package com.Amolit.phonebook.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Amolit.phonebook.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable>{

}
