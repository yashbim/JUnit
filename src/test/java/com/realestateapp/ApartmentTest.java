package com.realestateapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class ApartmentTest {

    @Test
    public void testGetArea() {
        Apartment apartment = new Apartment(50.0, BigDecimal.valueOf(5000.0));
        double expectedArea = 50.0;
        double actualArea = apartment.getArea();
        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testSetArea() {
        Apartment apartment = new Apartment(50.0, BigDecimal.valueOf(5000.0));
        double newArea = 60.0;
        apartment.setArea((float) newArea);
        double expectedArea = 60.0;
        double actualArea = apartment.getArea();
        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testGetPrice() {
        Apartment apartment = new Apartment(50.0, BigDecimal.valueOf(5000.0));
        BigDecimal expectedPrice = BigDecimal.valueOf(5000.0);
        BigDecimal actualPrice = apartment.getPrice();
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testSetPrice() {
        Apartment apartment = new Apartment(50.0, BigDecimal.valueOf(5000.0));
        BigDecimal newPrice = BigDecimal.valueOf(6000.0);
        apartment.setPrice(newPrice);
        BigDecimal expectedPrice = BigDecimal.valueOf(6000.0);
        BigDecimal actualPrice = apartment.getPrice();
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void testToString() {
        Apartment apartment = new Apartment(50.0, BigDecimal.valueOf(5000.0));
        String expectedString = "Apartment [area=50.0, price=5000.0]";
        String actualString = apartment.toString();
        Assertions.assertEquals(expectedString, actualString);
    }
}