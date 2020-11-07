import java.util.Random;

public class FestivalGate extends Thread {

    private int gate;

    @Override
    public void run(){
        Random random = new Random();
        gate = random.nextInt(10) + 1;
        System.out.println(gate);
    }

    public int getGate() {
        return gate;
    }
}
