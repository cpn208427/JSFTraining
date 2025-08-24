package com.cdp.ContactList.service;


import com.cdp.ContactList.dao.ContactDao;
import com.cdp.ContactList.dto.ContactDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;

    @Override
    public ContactDto create(ContactDto contactDto) {
        return null;
    }

    @Override
    public List<ContactDto> getAllContacts() {
        return List.of();
    }

    @Override
    public void deleteContact(UUID id) {

    }

    @Override
    public ContactDto updateContact(ContactDto contact) {
        return null;
    }

    @Override
    public List<ContactDto> searchByName(String name) {
        return List.of();
    }

    @Override
    public ContactDto getContactById(UUID id) {
        return null;
    }

    @Override
    public long getContactCount() {
        log.info("Controller sent request to ContatService and ServiceImplentation class");
        log.info("BeforeExecuting getActiveContacts() method in ServiceImplentation class");
        long count = contactDao.getActiveContacts();
        log.info("Rceived Response from ContatDaoImpl class");
        log.info("Total Active contacts count in Service class:" + count);
        return count;
    }
}

