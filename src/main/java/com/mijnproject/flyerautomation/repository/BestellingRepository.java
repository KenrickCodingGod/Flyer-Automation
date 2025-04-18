package com.mijnproject.flyerautomation.repository;

import com.mijnproject.flyerautomation.model.Bestelling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BestellingRepository extends JpaRepository<Bestelling, Long> {
}
