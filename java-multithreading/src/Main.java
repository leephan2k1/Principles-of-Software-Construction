import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Producer producer = new Producer();
        producer.setName("Cung cấp 1");
        producer.start();

        Consumer consumer = new Consumer(producer);
        consumer.setName("Tiêu thụ 1");
        consumer.start();

        while (true){
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if(input == 1){
                System.exit(0);
            }
        }
    }
}
