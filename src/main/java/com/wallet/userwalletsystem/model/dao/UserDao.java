package com.wallet.userwalletsystem.model.dao;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDao {

    @Id
    @Column(name = "email_id")
    private String emailId;

    @Column(name="phone_number", unique = true, nullable = false)
    private String phoneNumber;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="password")
    private String password;

    @Column(name = "pin")
    private String pin;
    
}
