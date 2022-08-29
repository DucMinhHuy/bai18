package baidoc1;

public class TestSynchronization2 {
    public static void main(String[] args) {
        final Table obj=new Table();
        Thread t1=new Thread(){
            public void run(){
                obj.printTable(5);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.printTable(100);
            }
        };
        t1.start();
        t2.start();
    }
}
