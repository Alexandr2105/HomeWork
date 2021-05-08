package HW_07052021.Concurrency;

import java.util.concurrent.Semaphore;

public class JewerelyStore extends Thread {
    Semaphore sem;
    int client;

    public JewerelyStore(Semaphore sem, int client) {
        this.sem = sem;
        this.client = client;
    }

    public void run() {
        try {
            sem.acquire();
            System.out.println("Клиент " + client + " пришёл");
            Thread.sleep(1 + (int) (Math.random() * 8) * 1000);
            System.out.println("Клиент " + client + " ушёл");
            sem.release();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}


