import Repository.TicketRepository;
import Repository.VehicleRepository;
import controllers.TicketController;
import dtos.IssueTicketRequestDto;
import dtos.IssueTicketResponseDto;
import dtos.ResponseStatus;
import models.VehicleType;
import services.TicketService;
import Repository.GateRepository;

public class Client {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDto request = new IssueTicketRequestDto();
        request.setGateId(1);
        request.setVehicleNumber("KA 26 N 5473");
        request.setVehicleType(VehicleType.SMALL_FOUR_WHEELER);
        request.setOwnerName("Arpit Vajrangi");

        IssueTicketResponseDto responseDto = ticketController.issueTicket(request);
        if (responseDto.getResponseStatus().equals(ResponseStatus.SUCCESS)) {
            System.out.println("Ticket successfully generated!");
            System.out.println(responseDto.getTicket().getParkingSlot().getSlotNumber());
        } else {
            System.out.println("Ticket is not generated due to " + responseDto.getFailureMessage());
        }
    }
}


//Creation of ticket: CRUD: ticket
//So the overall intention here is to create a ticket, read a ticket, update a ticket and delete a ticket.
//the major model here is the ticket model, so we will create a ticket controller

//adding a new floor: Floor Controller

// TicketController : TicketService : Repository
// topological sort