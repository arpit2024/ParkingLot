package controllers;

import dtos.IssueTicketRequestDto;
import dtos.IssueTicketResponseDto;
import dtos.ResponseStatus;
import models.Ticket;
import services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    //Ticket issueTicket(){
    IssueTicketResponseDto issueTicket(IssueTicketRequestDto request){
        IssueTicketResponseDto response =new IssueTicketResponseDto();

        Ticket ticket=ticketService.issueTicket(request.getGateId(),request.getVehicleNumber(),request.getOwnerName(),request.getVehicleType());
        response.setResponseStatus(ResponseStatus.SUCCESS);
        response.setTicket(ticket);

        return response;

    }
}
//using the model directly with the client is not suggested as it will break the encapsulation/expose the internal implementation
//so create a class called DTO - create a new class