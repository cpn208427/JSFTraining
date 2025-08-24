package com.cdp.ContactList.domain;

import lombok.Getter;
import lombok.Setter;

import java.awt.event.WindowStateListener;

@Getter
@Setter
public class Contact {
    private String UUID;
    private String name;
    private String email;
    private String phone;
    private boolean deleted ;



}
