package com.realestateapp;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class RandomApartmentGeneratorTest {

    @Test
    public void testGenerate() {
        RandomApartmentGenerator generator = new RandomApartmentGenerator(30, BigDecimal.valueOf(3000));

        for (int i = 0; i < 1000; i++) {
            Apartment apartment = generator.generate();

            // Check if area is within the specified range
            assertTrue(apartment.getArea() >= 30 && apartment.getArea() <= 30 * 4);

            // Check if price is calculated correctly based on area and price per square meter
            BigDecimal calculatedPrice = BigDecimal.valueOf(apartment.getArea()).multiply(BigDecimal.valueOf(3000));
            BigDecimal difference = calculatedPrice.subtract(apartment.getPrice());
            assertTrue(difference.abs().compareTo(BigDecimal.valueOf(12000)) <= 0);
        }
    }
}
