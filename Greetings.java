import java.util.*;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Greetings {
    private static Scanner input;

    public static void main(String[] args) {
        QueueControl greetQControl = new QueueControl();
        input = new Scanner(System.in);
        System.out.println("Enter the nicknames of 4 of your classmates:");
        for (int i=0; i<4; i++) {
            greetQControl.OfferToQueue(input.nextLine());
        }
        System.out.println("Press H to say Hi to each of them.");
        while (true) {
            String entry = input.nextLine();
            if (greetQControl.isQueueEmpty()) {
                System.out.println("Done saying Hi.");
                System.exit(-1);
            }
            if (entry.equalsIgnoreCase("h")) {
                System.out.println("Hi " + greetQControl.removeToQueue());
            }
        }

    }       

}
class QueueControl {
    PriorityQueue<String> _pQueue; 
    public QueueControl() {
        _pQueue = new PriorityQueue<>();
    }
    public void OfferToQueue(String s) {
        _pQueue.offer(s);
    }
    public Boolean isQueueEmpty() {
        return _pQueue.isEmpty();
    }
    public String removeToQueue() {
        return _pQueue.remove();
    }
}