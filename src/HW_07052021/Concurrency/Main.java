package HW_07052021.Concurrency;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore sem=new Semaphore(5);
        for(int i=1;i<100;i++ ){
            new JewerelyStore(sem,i).start();
        }
    }
}