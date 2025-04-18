package com.mijnproject.flyerautomation.repository;

import com.mijnproject.flyerautomation.model.Flyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlyerRepository extends JpaRepository<Flyer, Long> {
}
