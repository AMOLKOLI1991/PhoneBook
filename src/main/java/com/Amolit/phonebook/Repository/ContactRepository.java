package com.Amolit.phonebook.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Amolit.phonebook.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Serializable>{

}
