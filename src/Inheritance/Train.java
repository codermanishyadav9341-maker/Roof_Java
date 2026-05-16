package Inheritance;

public class Train {

    public void run(){
        System.out.println("Running.....");
    }
}

class Metro extends Train{

    @Override
    public void run(){
        System.out.println("Metro is running on electric track");

    }

    public static void main(String[] args){
        Metro mm = new Metro();
        mm.run();

    }
}