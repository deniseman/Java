package aplicatia4;

public class Fir3 extends Thread{
    private Object P10;
    Fir3(Object P10){
        this.P10=P10;
    }

    public void run(){
        try {
            System.out.println("P7");
            synchronized (P10) {
                P10.wait();
            }
            System.out.println("P8");
            int temp = (int) (Math.random() * (6 - 4 + 1) + 4);
            for (int i = 0; i < temp * 0.625 * Math.pow(10, 8); i++) {
                i++;
                i--;
            }
            System.out.println("P8 ends");
            System.out.println("P9");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
