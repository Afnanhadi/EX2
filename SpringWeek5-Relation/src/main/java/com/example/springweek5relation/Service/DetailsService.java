package com.example.springweek5relation.Service;

import com.example.springweek5relation.Api.ApiException;
import com.example.springweek5relation.DTO.DetailsDTO;
import com.example.springweek5relation.Model.Customer;
import com.example.springweek5relation.Model.Details;
import com.example.springweek5relation.Repostory.CostumerRepository;
import com.example.springweek5relation.Repostory.DetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DetailsService {
    private final CostumerRepository costumerRepository;
    private final DetailsRepository detailsRepository;

    public List<Details> getAlldetails(){
        return detailsRepository.findAll();
    }


    public void AddDetails(DetailsDTO detailsDTO) {
        Customer customer = costumerRepository.findCustomerById(detailsDTO.getCustomer_Id());
        Details details = new Details(null, detailsDTO.getGender(), detailsDTO.getAge(), detailsDTO.getEmail(), customer);
        detailsRepository.save(details);
    }
    public void update(Integer id, DetailsDTO detailsDTO){
       Details details =detailsRepository.getReferenceById(id);

        if (details ==null){
            throw new ApiException("not found");
        }
        details.setEmail(detailsDTO.getEmail());
        details.setAge(detailsDTO.getAge());
        details.setGender(detailsDTO.getGender());
        detailsRepository.save(details);

    }
    public void delete(Integer id){
       Details details=detailsRepository.getReferenceById(id);
       Customer customer=costumerRepository.findCustomerById(id);
        if (details ==null){
            throw new ApiException("not found");
        }
        customer.setDetails(null);
        costumerRepository.save(customer);
        detailsRepository.delete(details);
    }

}

