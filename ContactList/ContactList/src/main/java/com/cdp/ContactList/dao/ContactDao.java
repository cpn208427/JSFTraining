package com.cdp.ContactList.dao;

import com.cdp.ContactList.domain.Contact;

import java.util.List;
import java.util.UUID;

public interface ContactDao {

    Contact insert(Contact contact);
    Contact update(Contact contact);
    Contact delete(Contact contact);
    Contact findById(String id);
    List<Contact> selectAll();
    void delete(UUID id);
    ContactDao getContactById(UUID id);
    long getActiveContacts();

    }



