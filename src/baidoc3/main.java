package baidoc3;

public class main extends Thread{
    public static void main(String[] args) {
        Thread t= Thread.currentThread();
        System.out.println("thraed hien tai:"+t.getName());
        t.setName("minhhuy");
        System.out.println("sau khi doi ten:"+t.getName());
        System.out.println("do uu tien cua main thread:"+t.getPriority());
        t.setPriority(MAX_PRIORITY);
        System.out.println("do uu tien moi cua main thread :"+t.getPriority());
        for(int i=0;i<5;i++){
            System.out.println("main thread");
        }
        ChildThread ct=new ChildThread();
        System.out.println("do uu tien cua child thread:"+ct.getPriority());
        ct.start();
    }
}
