package com.kafein.kcinema.controller;

import com.kafein.kcinema.dto.TicketDto;
import com.kafein.kcinema.model.Ticket;
import com.kafein.kcinema.service.base.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @ResponseBody
    @GetMapping
    public List<TicketDto> findAll() {
        List<TicketDto> ticketDtos = ticketService.findAll();
        if(ticketDtos.size() == 0){
            throw new IllegalArgumentException("Herhangi bir bilet kayıtlı değil.");
        }
        return ticketDtos;
    }

    @ResponseBody
    @GetMapping("/findAllEmptySeats")
    public List<Integer> findAllEmptySeats(@RequestParam("id") int id) {
        List<Integer> ticketDtos = ticketService.findAllEmptySeats(id);
        if(ticketDtos.size() == 0){
            throw new IllegalArgumentException("Herhangi bir boş koltuk yok.");
        }
        return ticketDtos;
    }

    @ResponseBody
    @GetMapping("/findAllFullSeats")
    public List<Integer> findAllFullSeats(@RequestParam("id") int id) {
        List<Integer> ticketDtos = ticketService.findAllFullSeats(id);
        if(ticketDtos.size() == 0){
            throw new IllegalArgumentException("Herhangi bir bilet kayıtlı değil.");
        }
        return ticketDtos;
    }

    @ResponseBody
    @PostMapping
    public TicketDto save(@RequestBody TicketDto ticketDto) {
        return ticketService.save(ticketDto);
    }

    @ResponseBody
    @GetMapping("/findById")
    public TicketDto findById(@RequestParam("id") int id) {
        TicketDto ticketDto = ticketService.findById(id);
        if(ticketDto == null){
            throw new IllegalArgumentException("Bilet bulunamadı.");
        }
        return ticketDto;
    }

}
