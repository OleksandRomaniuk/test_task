package com.schedule.proj.repository;




import com.schedule.proj.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    Ticket getByTicketId(int id);
}
