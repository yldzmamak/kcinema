package com.kafein.kcinema.repository;

import com.kafein.kcinema.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat,Integer> {
}
