package com.schedule.proj.controller;



import com.schedule.proj.model.TicketDTO;
import com.schedule.proj.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/Ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @PostMapping("/ticket")
    public boolean saveticket(@RequestBody TicketDTO ticketDTO) {
        try {
            return  ticketService.findTiket(ticketDTO);
        } catch (RuntimeException e) {
           return false;
        }
    }
}


