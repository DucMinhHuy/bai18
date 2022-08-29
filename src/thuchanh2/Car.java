package thuchanh2;

import java.util.Random;

import static thuchanh2.Main.DISTANCE;
import static thuchanh2.Main.STEP;

public class Car implements Runnable{
    private String name;
    public Car(String name){
        this.name=name;
    }

    @Override
    public void run() {
        int runDistance=0;
        long StartTime=System.currentTimeMillis();
        while (runDistance<DISTANCE){
            try{
                int speed=(new Random()).nextInt(20);
                runDistance+=speed;
                String log="|";// danh dau xuat phat dich
                int percentTravel=(runDistance*100)/DISTANCE;
                for(int i=0;i<DISTANCE;i+=STEP){
                    if(percentTravel>=i+STEP){
                        log+="=";//danh dau quang duong xe da di qua
                    }else if(percentTravel>=i&&percentTravel<i+STEP){
                        log+="o";//xe dang o vi tri hien tai
                    }else {
                        log+="_";//quang duongcon lai ve dich
                    }
                }
                log+="|";
                System.out.println("Car"+this.name+":"+log+" "+ Math.min(DISTANCE,runDistance)+"KM");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Car"+this.name+"broken..");
                break;
            }
            long endTime=System.currentTimeMillis();
            System.out.println("Car"+this.name+"Finsh in"+(endTime-StartTime)/1000+"s");
        }
    }
}
