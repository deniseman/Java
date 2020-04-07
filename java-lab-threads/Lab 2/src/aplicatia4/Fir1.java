package aplicatia4;

public class Fir1 extends Thread{
    private Object P6;
    private Object P10;

    Fir1(Object P6,Object P10){
        this.P6=P6;
        this.P10=P10;
    }

    public void run(){
        try{
            System.out.println("P0");
            Thread.sleep(7000);
            System.out.println("P1");
            int temp = (int) (Math.random() * (3 - 2 + 1) + 2);
            for (int i = 0; i < temp * 0.625 * Math.pow(10, 8); i++) {
                i++;
                i--;
            }
            synchronized (P6){
                P6.notify();
            }
            synchronized (P10){
                P10.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
