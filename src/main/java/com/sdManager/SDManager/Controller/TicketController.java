package com.sdManager.SDManager.Controller;

import com.sdManager.SDManager.Entity.TicketStatus;
import com.sdManager.SDManager.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PatchMapping("/{ticketId}/status")
    public ResponseEntity<?> updateStatus(@PathVariable Long ticketId, @RequestBody TicketStatus newStatus) {
        ticketService.updateStatus(ticketId, newStatus);
        return ResponseEntity.ok().build();
    }
}


