package com.cdp.ContactList.service;

import com.cdp.ContactList.dto.ContactDto;

import java.util.List;
import java.util.UUID;

public interface ContactService {

    ContactDto create(ContactDto contactDto);
    List<ContactDto> getAllContacts();
    void deleteContact(UUID id);
    ContactDto updateContact(ContactDto contact);
    List<ContactDto> searchByName(String name);
    ContactDto getContactById(UUID id);
    long getContactCount();

    }


