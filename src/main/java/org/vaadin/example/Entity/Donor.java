package org.vaadin.example.Entity;

import javax.persistence.Entity;
import java.util.Date;


@Entity
public class Donor {
    private String DonorName;
    private String DonationType;
    private String Quantity;
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
