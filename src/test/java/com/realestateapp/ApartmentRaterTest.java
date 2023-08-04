package com.realestateapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ApartmentRaterTest {

    @Test
    public void testRateApartment() {
        // Test cheap apartment
        Apartment cheapApartment = new Apartment(0, BigDecimal.valueOf(2000));
        assertEquals(-1, ApartmentRater.rateApartment(cheapApartment));

        // Test moderate apartment
        Apartment moderateApartment = new Apartment(2, BigDecimal.valueOf(14000));
        assertEquals(1, ApartmentRater.rateApartment(moderateApartment));

        // Test expensive apartment
        Apartment expensiveApartment = new Apartment(2, BigDecimal.valueOf(18000));
        assertEquals(2, ApartmentRater.rateApartment(expensiveApartment));
    }

    @Test
    public void testCalculateAverageRating() {
        List<Apartment> apartments = Arrays.asList(
                new Apartment(0.3, BigDecimal.valueOf(2000)),
                new Apartment(0.3, BigDecimal.valueOf(7000)),
                new Apartment(80, BigDecimal.valueOf(9000))
        );
        double expectedAverageRating = (0 + 1 + 2) / 3.0;
        double actualAverageRating = ApartmentRater.calculateAverageRating(apartments);
        assertEquals(expectedAverageRating, actualAverageRating, 0.01);
    }
}
