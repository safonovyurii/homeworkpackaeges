package ru.netology.homework.homeworkpackaeges.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class VacationServiceTest {
    @Test
    void VacationExampleOneCalculate() {
        VacationService service = new VacationService();
        int count = 3;
        long actual = service.calculate(10000,3000,20000);
        Assertions.assertEquals(count, actual);

    }
    @Test
     void VacationExampleTwoCalculate(){
        VacationService service = new VacationService();
        int count = 2;
        long actual = service.calculate(100000,60000,150000);
        Assertions.assertEquals(count, actual);
    }
}
