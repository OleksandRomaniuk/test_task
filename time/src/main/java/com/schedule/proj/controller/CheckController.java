package com.schedule.proj.controller;



import com.schedule.proj.model.CheckDTO;
import com.schedule.proj.model.TicketDTO;
import com.schedule.proj.service.Check_inService;
import com.schedule.proj.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Check")
public class CheckController {

    @Autowired
    Check_inService check_inService;

    @PostMapping("/ticket")
    public boolean saveticket(@RequestBody CheckDTO checkDTO) {
        try {
            return  check_inService.makeCheck_in(checkDTO);
        } catch (RuntimeException e) {
           return false;
        }
    }
}


