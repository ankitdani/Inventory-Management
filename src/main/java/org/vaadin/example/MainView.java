package org.vaadin.example;

import com.vaadin.flow.component.grid.Grid;
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

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        //grid of transactions
        Grid<DonorDetails> grid = new Grid<>(DonorDetails.class);
        grid.addColumn(DonorDetails::getDonorName);
        grid.addColumn(DonorDetails::getDonationType);
        grid.addColumn(DonorDetails::getQuantity);
        grid.addColumn(DonorDetails::getDate);

//        List<DonorDetails> donor =
//        grid.setItems(donor);

        //field for search
        TextField searchField = new TextField();
        searchField.setWidth("50%");
        searchField.setPlaceholder("Search");

    }

}
