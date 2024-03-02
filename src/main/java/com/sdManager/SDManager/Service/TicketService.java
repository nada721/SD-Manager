package com.sdManager.SDManager.Service;

import com.sdManager.SDManager.Entity.Ticket;
import com.sdManager.SDManager.Entity.TicketStatus;
import com.sdManager.SDManager.Repository.TicketRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public void updateStatus(Long ticketId, TicketStatus newStatus) {
        Ticket ticket = ticketRepository.findById(ticketId)
                                        .orElseThrow(() -> new EntityNotFoundException("Ticket not found with id: " + ticketId));

        ticket.setStatus(newStatus);
        ticket.setUpdatingDate(LocalDateTime.now()); // Assuming updating date should be set to current time

        ticketRepository.save(ticket);
    }
}
