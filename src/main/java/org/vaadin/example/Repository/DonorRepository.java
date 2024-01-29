package org.vaadin.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vaadin.example.Entity.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}
