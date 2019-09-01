public class One extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Name => "+ Thread.currentThread().getName());
        System.out.println("Going to sleep");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Sleep is over");
    }
}
