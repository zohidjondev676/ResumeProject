package com.example.resumeproject.job;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Job_posting {
    private int id;
    private String title;
    private String description;
    private String address;
    private boolean jobStatus;
    private String requirement;


}
