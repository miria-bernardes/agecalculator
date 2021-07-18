package br.com.bootcamp.agecalculator.controllers;

import br.com.bootcamp.agecalculator.services.AgeCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class AgeCalculatorController {

    private final AgeCalculatorService ageCalculatorService;

    @Autowired
    public AgeCalculatorController(AgeCalculatorService ageCalculatorService) {
        this.ageCalculatorService = ageCalculatorService;
    }

    @GetMapping("age/{data}")
    public int calc(@PathVariable("data") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
        return ageCalculatorService.calc(date);
    }
}
