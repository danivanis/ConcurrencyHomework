import java.util.Random;

public class FestivalAttendeeThread implements Runnable{

    private int people;
    private FestivalGate gate;
    private TicketType ticketType;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate){
        this.gate = gate;
        this.ticketType = ticketType;
    }

    @Override
    public void run(){

        Random random = new Random();
        people = random.nextInt(100) + 1;
        System.out.println(people + " people have " + ticketType);
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public FestivalGate getGate() {
        return gate;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

}
