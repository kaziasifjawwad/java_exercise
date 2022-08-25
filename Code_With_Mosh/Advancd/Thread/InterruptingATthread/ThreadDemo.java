package Code_With_Mosh.Advancd.Thread.InterruptingATthread;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread thread_1 = new Thread(new DownloadFileTask(500));
        thread_1.start();

        Thread thread_2 = new Thread(new DownloadFileTask(100));
        thread_2.start();
        
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        thread.interrupt();
    }
}