package com.cdp.ContactList.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactDto {

    private String UUID;
    private String name;
    private String email;
    private String phone;
    private boolean deleted ;
}
