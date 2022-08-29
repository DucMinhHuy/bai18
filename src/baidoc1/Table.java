package baidoc1;

public class Table {
    void printTable(int n){
        synchronized (this){
        // (method : phuong thuc) khong (synchronized: dong bo)
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
