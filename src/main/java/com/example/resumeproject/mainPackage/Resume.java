package com.example.resumeproject.mainPackage;

import com.example.resumeproject.enums.Job_category;
import com.example.resumeproject.enums.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Resume {
    private int id;
    private String description;
    private Job_category jobCategory;
    private Language language;
}
