package de.bewerbung.main.repositories;

import de.bewerbung.main.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
