package com.example.springweek5relation.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer Id;
    private String name;

    @OneToOne(cascade=CascadeType.ALL,mappedBy  ="customer")
    @PrimaryKeyJoinColumn
    private Details details;
}
