package com.cdp.ContactList.api;


import com.cdp.ContactList.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/V1/ContactList")
public class ContactController {


    @Autowired
    private ContactService contactService;

    @GetMapping("/activeCount")
    public ResponseEntity<Long> getCount() {
        log.info("Request received in Controller class via Postman GET URL - http:/api/V1/ContactList/activeCount");
        return ResponseEntity.ok(contactService.getContactCount());

    }

}

