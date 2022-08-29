package thuchanh1;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;
    RunnableDemo(String name){
        threadName=name;
        System.out.println("Creating :"+threadName);
    }

    @Override
    public void run() {
        System.out.println("running +"+threadName);
        try{
            for (int i = 4; i >0 ; i--) {
                System.out.println("thread :"+threadName+","+i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("thread :"+threadName+"interrupted");
        }
        System.out.println("thread"+threadName+"exiting");
    }
    public void start(){
        System.out.println("Starting ;"+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}
