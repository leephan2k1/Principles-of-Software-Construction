import java.util.Scanner;

public class Consumer extends Thread{
    private Producer producer;
    public Consumer(Producer producer){
        this.producer = producer;
    }

    @Override
    public void run() {
        try{
            while (true){
                String data = producer.consume();
                System.out.println("Tiêu thụ bởi: " + Thread.currentThread().getName() + " --- dữ liệu: " + data);
                Thread.sleep(2000);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
