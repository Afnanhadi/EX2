package com.example.springweek5relation.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DetailsDTO {

    private Integer customer_Id;
    private String gender;
    private  Integer age;
    private String email;
}
