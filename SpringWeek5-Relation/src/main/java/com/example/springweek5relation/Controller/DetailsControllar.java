package com.example.springweek5relation.Controller;

import com.example.springweek5relation.DTO.DetailsDTO;
import com.example.springweek5relation.Model.Customer;
import com.example.springweek5relation.Service.DetailsService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/details")
@RequiredArgsConstructor
public class DetailsControllar {

private final DetailsService detailsService;

    @GetMapping("/get")
    private ResponseEntity getAllDetails(){
        return ResponseEntity.status(200).body(detailsService.getAlldetails());
    }
    @PostMapping("/add")
    public ResponseEntity add(@RequestBody @Valid DetailsDTO detailsDTO){
        detailsService.AddDetails(detailsDTO);
        return ResponseEntity.status(200).body("add details");
    }
    @PutMapping("/update/{id}")
    public ResponseEntity Update(@RequestBody @Valid DetailsDTO detailsDTO, @PathVariable Integer id){
        detailsService.update(id,detailsDTO);
        return ResponseEntity.status(200).body("Update Details");
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable  Integer id){
        detailsService.delete(id);
        return ResponseEntity.status(200).body("Delete Details");
    }
}
