package Code_With_Mosh.Advancd.Thread.StartAThread;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("downloading a file ---> "+Thread.currentThread().getName());
    }
}
