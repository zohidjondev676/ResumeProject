package com.example.resumeproject.user;

import com.example.resumeproject.enums.Account_type;
import com.example.resumeproject.enums.User_type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {

    private UUID id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String password;
    private Account_type accountType;

    private User_type userType;


}
