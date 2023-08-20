package com.example.springweek5relation.Controller;

import com.example.springweek5relation.Model.Customer;
import com.example.springweek5relation.Service.CostomerServic;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/Costumer")
public class CostomerController {
    private  final CostomerServic costomerServic;
    @GetMapping("/get")
    private ResponseEntity getAllCostumer(){
        return ResponseEntity.status(200).body(costomerServic.getAllCostumer());
    }

    @PostMapping("/add")
    public ResponseEntity addCustomer(@RequestBody @Valid Customer customer){
        costomerServic.AddCostumer(customer);
        return ResponseEntity.status(200).body("add Product");
    }
    @PutMapping("/update/{id}")
    public ResponseEntity UpdateCustomer(@RequestBody @Valid Customer customer, @PathVariable Integer id){
        costomerServic.update(id, customer);
        return ResponseEntity.status(200).body("Update Product");
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCustomer(@PathVariable  Integer id){
        costomerServic.delete(id);
        return ResponseEntity.status(200).body("Delete Product");
    }
}
