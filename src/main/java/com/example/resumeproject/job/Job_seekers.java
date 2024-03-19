package com.example.resumeproject.job;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Job_seekers {

    private int id;

    private int user_Id;
    private String first_name;
    private String last_name;
    private int resume_id;
    private String phoneNumber;



}
