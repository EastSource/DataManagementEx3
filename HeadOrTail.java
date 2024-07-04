import com.sun.source.util.TaskListener;

import java.util.Random;

public class HeadOrTail {
    private static int range = 2;
    public static int headsCounter = 0;
    public static int tailsCounter = 0;
    public static void main(String[] args) {
        Random rnd = new Random();
        int key;
        System.out.println("Tossing a coin...");
        for (int i = 1; i < 4; i++){
            System.out.print("Round " + i + ": ");
            key = rnd.nextInt(range);
            if (key == 1){
                System.out.println("Head");
                headsCounter++;
            }else
            {
                System.out.println("Tails");
                tailsCounter++;
            }
        }
        System.out.println("Head: " + headsCounter + ", Tails: " + tailsCounter);
    }
}
