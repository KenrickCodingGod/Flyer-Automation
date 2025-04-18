package com.mijnproject.flyerautomation.repository;

import com.mijnproject.flyerautomation.model.Gebruiker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GebruikerRepository extends JpaRepository<Gebruiker, Long> {
}
