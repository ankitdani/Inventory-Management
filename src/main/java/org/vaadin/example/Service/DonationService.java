package org.vaadin.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaadin.example.Entity.Donor;
import org.vaadin.example.Repository.DonorRepository;

import java.util.List;

@Service
public class DonationService {
    private DonorRepository donorRepository;

    @Autowired
    public DonationService(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    public List<Donor> getAllDonors(){
        return donorRepository.findAll();
    }

    public Donor saveDonor(Donor donor){
        return donorRepository.save(donor);
    }
}
