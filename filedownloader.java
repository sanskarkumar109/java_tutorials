public class filedownloader {
    public static void main(String[] args) {
        filedownloadthread filedownloadthread=new filedownloadthread();
        filedownloadthread.start();
        fileprogressthread fileprogressthread=new fileprogressthread();
        fileprogressthread.start();

    }
}

class filedownloadthread extends Thread{
    public void run(){
        try{
            System.out.println("downloading file.....");
            Thread.sleep(5000);

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("file download complete.");
    }
}

class fileprogressthread extends Thread{
    private final Thread filedownloadthread;

    public fileprogressthread(Thread filedownloadthread){
        this.filedownloadthread=filedownloadthread;
    }
    public void run(){
        try{
            filedownloadthread.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("download progress 100%..");
    }
}
