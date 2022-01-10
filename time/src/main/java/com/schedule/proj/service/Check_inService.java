package com.schedule.proj.service;


import com.schedule.proj.model.CheckDTO;
import com.schedule.proj.model.Check_in;
import com.schedule.proj.model.Ticket;
import com.schedule.proj.model.TicketDTO;
import com.schedule.proj.repository.Check_inRepository;
import com.schedule.proj.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class Check_inService {

    private final Check_inRepository check_inRepository;

    public void deleteTicket(Integer id) {
        check_inRepository.deleteById(id);
    }


    public boolean makeCheck_in(CheckDTO dto) {
        Integer destination = dto.getDestinationId();
        Integer baggage = dto.getBaggageId();

        if(check_inRepository.getByBaggageIdAndAndDestinationId(destination, baggage)==null){
            Check_in check_in;
            check_in = new Check_in();
            check_in.setBaggageId(baggage);
            check_in.setDestinationId(destination);
            check_inRepository.save(check_in);
            return  true;
        }
        else
            return  false;
    }

}