package com.example.springweek5relation.Service;


import com.example.springweek5relation.Api.ApiException;
import com.example.springweek5relation.Model.Customer;
import com.example.springweek5relation.Repostory.CostumerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CostomerServic {
    private  final CostumerRepository costumerRepository;


    public List<Customer> getAllCostumer(){
        return costumerRepository.findAll();
    }
    public void AddCostumer(Customer customer){
        costumerRepository.save(customer);
    }
    public void update(Integer id, Customer customer){
        Customer customer1 =costumerRepository.getReferenceById(id);

        if (customer1 ==null){
            throw new ApiException("not found");
        }
        customer1.setName(customer.getName());

    }
    public void delete(Integer id){
        Customer customer =costumerRepository.getReferenceById(id);
        if (customer ==null){
            throw new ApiException("not found");
        }
        costumerRepository.delete(customer);
    }
}
