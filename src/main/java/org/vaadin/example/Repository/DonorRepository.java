package org.vaadin.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.vaadin.example.Entity.Donor;
@Repository
public interface DonorRepository extends JpaRepository<Donor, Long> {
}
