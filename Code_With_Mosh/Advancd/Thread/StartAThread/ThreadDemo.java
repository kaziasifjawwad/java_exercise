package Code_With_Mosh.Advancd.Thread.StartAThread;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for(var i =0;i<100;i++){
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }

    }

}
