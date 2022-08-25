package Code_With_Mosh.Advancd.Thread.InterruptingATthread;

public class DownloadFileTask implements Runnable {



    private int  sleepTime;

    public DownloadFileTask(int sleepTime) {
        this.sleepTime = sleepTime;

    }


    @Override
    public void run() {

        System.out.println(
                "downloading a file ---> " +
                        Thread.currentThread().getName() +
                        " ------------ " + System.currentTimeMillis()
        );

        for (var i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(this.sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println(
                "download complete ---> "
                        + Thread.currentThread().getName() +
                        " ------------ " + System.currentTimeMillis()
        );
    }



}
