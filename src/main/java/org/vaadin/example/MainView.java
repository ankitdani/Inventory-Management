package org.vaadin.example;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.vaadin.example.Entity.Donor;
import org.vaadin.example.Repository.DonorRepository;
import org.vaadin.example.Service.DonationService;

import java.util.List;

@Route(value = "main-view")
public class MainView extends VerticalLayout {

    private TextField donorNameField = new TextField();
    private DonationService donationService;
    Grid<Donor> grid = new Grid<>(Donor.class, false);

    public MainView(DonationService donationService){
        this.donationService = donationService;
        setGrid();
        addDonorForm();
    }

    public void addDonorForm(){
        donorNameField.setPlaceholder("Enter donor name:");
        Button saveButton = new Button("Save", event -> saveDonor());
        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        add(donorNameField, saveButton);
    }

    public void saveDonor(){
        Donor donor = new Donor();
        donor.setDonorName(donorNameField.getValue());
        donationService.saveDonor(donor);
        setGrid();
    }

    public void setGrid(){
        grid.addColumn(Donor::getDonorName).setHeader("Donor Name");
        List<Donor> donors = donationService.getAllDonors();
        grid.setItems(donors);
    }






}
