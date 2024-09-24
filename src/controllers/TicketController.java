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


//currently we are not catching any exception here and returning the response directly to the client instead apply try catch block
    //Ticket issueTicket(){
    IssueTicketResponseDto issueTicket(IssueTicketRequestDto request){
        IssueTicketResponseDto response =new IssueTicketResponseDto();
        //basic validation if any can be done here

        try {
            //request obj can have lot of other details.so internally we do not send the request dto everywhere/ to the service
            Ticket ticket = ticketService.issueTicket(request.getGateId(),
                    request.getVehicleNumber(),
                    request.getOwnerName(),
                    request.getVehicleType());
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setTicket(ticket);
        }
        catch (Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(e.getMessage());
        }
        return response;

    }
}
//using the model directly with the client is not suggested as it will break the encapsulation/expose the internal implementation
//so create a class called DTO - create a new class