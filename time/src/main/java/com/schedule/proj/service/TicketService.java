package com.schedule.proj.service;


import com.schedule.proj.model.Ticket;
import com.schedule.proj.model.TicketDTO;
import com.schedule.proj.repository.TicketRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;

    public void deleteTicket(Integer id) {
        ticketRepository.deleteById(id);
    }

    public List<Ticket> getAllTicket() {
        return ticketRepository.findAll();
    }

    public Ticket addStudent(Ticket student) {
        return ticketRepository.save(student);
    }

    public boolean findTiket(TicketDTO dto) {
        Integer id = dto.getTicketId();
        if(ticketRepository.getByTicketId(id)==null){
            Ticket c;
            c = new Ticket();
            c.setEmpty(false);
            ticketRepository.save(c);
            return  true;// забронбвали собі квиток
        }
        else return  false;
      }

}