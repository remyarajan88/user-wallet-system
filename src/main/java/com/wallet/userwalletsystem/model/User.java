package com.wallet.userwalletsystem.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String emailId;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String password;
    private String pin;


}
