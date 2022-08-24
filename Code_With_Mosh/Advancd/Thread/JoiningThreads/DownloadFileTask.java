package Code_With_Mosh.Advancd.Thread.JoiningThreads;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {
        System.out.println("downloading a file ---> "+Thread.currentThread().getName()+ " ------------ " +System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("download complete ---> " + Thread.currentThread().getName()+ " ------------ " +System.currentTimeMillis());
    }
}
