package com.example.springweek5relation.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Details {
    @Id
    private Integer Id;
    private String gender;
    private  Integer age;
    private String email;
    @OneToOne
    @MapsId
    @JsonIgnore
    private Customer customer;
}
