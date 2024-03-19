package com.example.resumeproject.job;

  import lombok.AllArgsConstructor;
  import lombok.Data;
  import lombok.NoArgsConstructor;

  import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Apply_jobs {

    private  int id;
    private int job_seekers_id;
    private  int job_posting_id;
    private boolean status;
    private Date application_date;

}
