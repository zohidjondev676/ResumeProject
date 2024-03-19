package com.example.resumeproject.employer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employer {
                  @Id
    private Integer user_id;
    private String company_name;
    private String email;
    private Integer id;

}
