package com.d2d.creditrating.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class CreditRatingController {

    @GetMapping("getCreditRating/{idNumber}")
    public Integer checkCustomerRating(@PathVariable String idNumber){

          Integer max = 10;
          Integer min = 1;
          return new Random().nextInt(max-min)+min;

    }
}
