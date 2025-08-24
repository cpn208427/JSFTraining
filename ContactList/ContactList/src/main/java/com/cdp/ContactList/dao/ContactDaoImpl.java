package com.cdp.ContactList.dao;

import com.cdp.ContactList.domain.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Slf4j
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Contact insert(Contact contact) {
        return null;
    }

    @Override
    public Contact update(Contact contact) {
        return null;
    }

    @Override
    public Contact delete(Contact contact) {
        return null;
    }

    @Override
    public Contact findById(String id) {
        return null;
    }

    @Override
    public List<Contact> selectAll() {
        return List.of();
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public ContactDao getContactById(UUID id) {
        return null;
    }

    @Override
    public long getActiveContacts() {
        log.info("Request received from ServiceImplentation class to ContactDao and ContactDaoImpl class");
        String sql = "SELECT COUNT(*) FROM contact WHERE deleted = false";
        log.info("BeforeExecuting Select query to get active contacts count" + sql);
        log.info("Invoking JDBCTemplate queryForObject() method to get active contacts count");
        Long count= jdbcTemplate.queryForObject(sql, Long.class);
        log.info("AfterExecuting Select query to get active contacts count");
        log.info("Total Active contacts count in ContactDaoImpl class:" + count);
        log.info("Returning count from DAO to Service method");
        return count!=null?count:0;

    }
}
