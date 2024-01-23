package org.vaadin.example;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.util.List;
import java.util.Locale;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        //grid of transactions
        Grid<DonorDetails> grid = new Grid<>(DonorDetails.class);
        grid.addColumn(DonorDetails::getDonorName);
        grid.addColumn(DonorDetails::getDonationType);
        grid.addColumn(DonorDetails::getQuantity);
        grid.addColumn(DonorDetails::getDate);

//        grid.setItems(donor);

        TextField DonorName = new TextField();
        DonorName.setLabel("Donor Name:");
//        DonorName.setValue("FirstName LastName");
        DonorName.setClearButtonVisible(true);
//        DonorName.setPrefixComponent(VaadinIcon.MAP_MARKER.create());


        TextField DonationType = new TextField();
        DonationType.setLabel("Donation Type:");
//        DonationType.setValue("Money, food, clothing");
        DonationType.setClearButtonVisible(true);
//        DonationType.setPrefixComponent(VaadinIcon.MAP_MARKER.create());


        TextField Quantity = new TextField();
        Quantity.setLabel("Quantity:");
//        Quantity.setValue("$");
        Quantity.setClearButtonVisible(true);
//        Quantity.setPrefixComponent(VaadinIcon.MAP_MARKER.create());


        DatePicker DateOfDonation = new DatePicker("Date of Donation:");
        DateOfDonation.setAutoOpen(true);


        Button Donate = new Button("Donate");
        Donate.addThemeVariants(ButtonVariant.LUMO_PRIMARY);


        Button Distribute = new Button("Distribute");
        Distribute.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button AllDonations = new Button("View all Donations");
        AllDonations.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button AllDistributions = new Button("View all Distributions");
        AllDistributions.addThemeVariants(ButtonVariant.LUMO_PRIMARY);


        VerticalLayout layout = new VerticalLayout();
        layout.add(DonorName);
        layout.add(DonationType);
        layout.add(Quantity);
        layout.add(DateOfDonation);
        layout.add(Donate);
        layout.add(Distribute);
        layout.add(AllDonations);
        layout.add(AllDistributions);
        add(grid);
        add(layout);


    }

}
