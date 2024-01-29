package org.vaadin.example.Entity;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String DonorName;
    @NotEmpty
    private String DonationType;
    @NotEmpty
    private String Quantity;
    @NotEmpty
    private Date Date;

    public Donor() {
    }

    public Donor(String donorName, String donationType, String quantity, java.util.Date date) {
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

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }
}
