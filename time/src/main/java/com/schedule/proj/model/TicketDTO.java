package com.schedule.proj.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TicketDTO {

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    private Integer ticketId;



}
