package Code_With_Mosh.Advancd.Thread.PausingAThread;

import Code_With_Mosh.Advancd.Thread.PausingAThread.DownloadFileTask;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for(var i =0;i<10;i++){
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }

    }

}