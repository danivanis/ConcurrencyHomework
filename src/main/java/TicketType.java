import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TicketType implements Runnable {

    List<String> myList = Arrays.asList("full", "full-vip", "free-pass", "one-day", "one-day-vip");

    @Override
    public void run(){
        Random random = new Random();
        int randomItem = random.nextInt(myList.size());
        String randomElement = myList.get(randomItem);
        System.out.println(randomElement);
    }

    public List<String> getMyList() {
        return myList;
    }
}
