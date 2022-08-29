package thuchanh1;

public class Main {
    public static void main(String[] args) {
        System.out.println("main thread running...");
        RunnableDemo rd=new RunnableDemo("thread-1-hr-database");
        rd.start();
        RunnableDemo rd1=new RunnableDemo("thread-2-send-email");
        rd1.start();
        System.out.println("main thread stopped");
    }
}
