package org.vaadin.example;

import java.util.Date;

public class DonorDetails {
    String DonorName;
    String DonationType;
    Long Quantity;
    Date Date;

    public DonorDetails() {
    }

    public DonorDetails(String donorName, String donationType, Long quantity, java.util.Date date) {
        DonorName = donorName;
        DonationType = donationType;
        Quantity = quantity;
        Date = date;
    }

    public String getDonorName() {
        return DonorName;
    }

    public void setDonorName(String donorName) {
        DonorName = donorName;
    }

    public String getDonationType() {
        return DonationType;
    }

    public void setDonationType(String donationType) {
        DonationType = donationType;
    }

    public Long getQuantity() {
        return Quantity;
    }

    public void setQuantity(Long quantity) {
        Quantity = quantity;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }
}
