public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread => " + Thread.currentThread().getName());
        System.out.println("A new thread is starting");
        One one = new One();
        one.start();
        try{
            one.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Main is running again now and the other thread has ended");
        System.out.println("Main Thread => " + Thread.currentThread().getName());
    }
}
