package com.kafein.kcinema.repository;

import com.kafein.kcinema.dto.TicketDto;
import com.kafein.kcinema.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
    Ticket findById(int id);

    @Query(value = "SELECT ticket.seat_id FROM kcinemadb.ticket ticket " +
            "JOIN kcinemadb.film_salon film_salon " +
            "ON(ticket.film_salon_id=film_salon.id) WHERE ticket.film_salon_id = :film_salon_id", nativeQuery = true)
    List<Integer> findAllFullSeats(@Param("film_salon_id") int film_salon_id);

    @Query(value = "SELECT seat.id FROM kcinemadb.seat " +
            "JOIN kcinemadb.film_salon ON(seat.salon_id=film_salon.salon_id)" +
            "WHERE film_salon.id= :film_salon_id AND kcinemadb.seat.id NOT IN(SELECT ticket.seat_id FROM kcinemadb.ticket ticket " +
            "JOIN kcinemadb.film_salon film_salon " +
            "ON(ticket.film_salon_id=film_salon.id) WHERE ticket.film_salon_id= :film_salon_id)", nativeQuery = true)
    List<Integer> findAllEmptySeats(@Param("film_salon_id") int film_salon_id);

//    List<Ticket> findAllBySeat_Id(int id);
}

//SELECT ticket.seat_id FROM kcinemadb.ticket ticket JOIN kcinemadb.film_salon film_salon ON(ticket.film_salon_id=film_salon.id) WHERE ticket.film_salon_id=1;