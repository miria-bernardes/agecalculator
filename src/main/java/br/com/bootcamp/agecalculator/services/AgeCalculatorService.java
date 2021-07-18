package br.com.bootcamp.agecalculator.services;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Service
public class AgeCalculatorService {

    public int calc(LocalDate date) {
        return Period.between(date, LocalDate.now()).getYears();
    }

}
