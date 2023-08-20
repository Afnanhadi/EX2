package com.example.springweek5relation.Repostory;

import com.example.springweek5relation.DTO.DetailsDTO;
import com.example.springweek5relation.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends JpaRepository<Customer,Integer> {
    Customer findCustomerById(Integer id);
}
