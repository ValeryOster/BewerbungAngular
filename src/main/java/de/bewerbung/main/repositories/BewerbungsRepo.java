package de.bewerbung.main.repositories;

import de.bewerbung.main.entities.Bewerbung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BewerbungsRepo extends JpaRepository<Bewerbung, Long> {
}
