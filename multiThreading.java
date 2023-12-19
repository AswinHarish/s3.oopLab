import java.util.Random;

class RandomThread extends Thread{
    
    public void run(){
    Random random = new Random();
        for(int i = 0; i < 10; i++){
            int n = random.nextInt(100);
            if (n % 2 == 0){
                EvenThread even = new EvenThread(n);
                even.start();
            }
            else {
                OddThread odd = new OddThread(n);
                odd.start();
            }
        }
    }
}

class EvenThread extends Thread{
    int num;
    
    public EvenThread(int n){
        this.num = n;
    }
    public void run(){
        System.out.println("Square of " + num +" is " + num * num);
    }
}

class OddThread extends Thread{
    int num;
    
    public OddThread(int n){
        this.num = n;
    }
    public void run(){
        System.out.println("Cube of " + num +" is " + num * num * num);
    }
}

public class multiThreading{
    public static void main(String[] args){
        RandomThread r = new RandomThread();
        r.start();
    }
}
