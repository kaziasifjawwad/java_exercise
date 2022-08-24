package Code_With_Mosh.Advancd.Thread.PausingAThread;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("downloading a file ---> "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("download complete" + Thread.currentThread().getName());
    }
}
