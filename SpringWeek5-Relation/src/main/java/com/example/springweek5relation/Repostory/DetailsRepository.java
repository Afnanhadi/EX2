package com.example.springweek5relation.Repostory;

import com.example.springweek5relation.Model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends JpaRepository<Details,Integer> {



}
