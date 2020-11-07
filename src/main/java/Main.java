import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FestivalGate gate = new FestivalGate();
        TicketType ticketType = new TicketType();
        FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);

        festivalAttendee.setPeople(100);
        Thread[] festivalAttendeeThread = new Thread[festivalAttendee.getPeople()];
        for (int i = 0; i < festivalAttendee.getPeople(); i++){
            System.out.println(i + " people have " + ticketType);
            festivalAttendeeThread[i].start();
        }

        for (Thread thread: festivalAttendeeThread){
            try {
                thread.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }
}
