import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Producer extends Thread{
    private static final int MAX_SIZE = 3;
    private final List<String> messages = new ArrayList<>();

    @Override
    public void run() {
        try {
             while (true){
                 produce();
                 Thread.sleep(2000);
             }
        }catch (Exception exp){
            System.out.println(exp.getMessage());
        }
    }

    private synchronized void produce() throws Exception{
        while(messages.size() == MAX_SIZE){
            System.out.println("Alo Alo! Kho đầy, chưa sản xuất được!");
            wait();
        }
        String data = LocalDateTime.now().toString();
        messages.add(data);
        System.out.println("Producer " + Thread.currentThread().getName() +"  đã sản xuất dữ liệu!");
        notify();
    }
    public synchronized String consume() throws Exception{
        notify();
        while(messages.isEmpty()){
            System.out.println("Alo Alo! Tiêu thụ nhanh quá, chưa sản xuất kịp");
            wait();
        }
        String data = messages.get(0);
        messages.remove(data);
        return data;
    }
}
