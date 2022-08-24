package Code_With_Mosh.Advancd.Thread.JoiningThreads;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

//        try {
//            thread.join();
//        } catch (InterruptedException exception) {
//            exception.printStackTrace();
//        }

        System.out.println("file is ready");

    }
}