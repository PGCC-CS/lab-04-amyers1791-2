import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PCBQueue readyQueue = new PCBQueue();
        PCBQueue waitQueue = new PCBQueue();
        Scanner scanner = new Scanner(System.in);

        boolean addToReady = true;

        while (true) {
            System.out.print("Enter PID (-1 to stop):  ");
            int pid = scanner.nextInt();

            if (pid == -1) break;
            if (addToReady) {
                readyQueue.enqueue(pid);
            } else {
                waitQueue.enqueue(pid);
            }

            addToReady = !addToReady;
        }
        int choice;
        do {
            System.out.println("\nUtility Menu:");
            System.out.println("1) Move from Wait to Ready");
            System.out.println("2) Move from Ready to Wait");
            System.out.println("3) Run Process");
            System.out.println("4) Display all");
            System.out.println("5) Display Ready Queue");
            System.out.println("6) Display Wait Queue");
            System.out.println("7) Exit");

            System.out.print("Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    PCB fromWait = waitQueue.dequeue();
                    if (fromWait != null) {
                        readyQueue.enqueue(fromWait.getPid());
                    }
                    break;

                case 2:
                    PCB fromReady = readyQueue.dequeue();
                    if (fromReady != null) {
                        waitQueue.enqueue(fromReady.getPid());
                    }
                    break;

                case 3:
                    PCB run = readyQueue.dequeue();
                    if (run != null) {
                        System.out.println("Running PID: " + run.getPid());
                    } else {
                        System.out.println("Ready queue is empty.");
                    }
                    break;

                case 4:
                    System.out.println("All processes:");
                    readyQueue.display();
                    waitQueue.display();
                    break;

                case 5:
                    System.out.println("Ready Queue:");
                    readyQueue.display();
                    break;

                case 6:
                    System.out.println("wait Queue:");
                    waitQueue.display();
                    break;
                }

        } while (choice != 7);
        scanner.close();

    }
}

