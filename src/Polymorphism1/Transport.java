package Polymorphism1;

public class Transport {

    public void travelMode(){
        System.out.println("Travelling......");
    }
}

class Bus extends Transport{

    @Override
    public void travelMode(){
        System.out.println("Travelling by Bus");
    }
}

class Train extends Transport{

    @Override
    public void travelMode(){
        System.out.println("Travelling by train");
    }
}

class Flight extends Transport{

    @Override
    public void travelMode(){
        System.out.println("Travelling by flight");
    }

    public static void main(String[] args){
        Transport tt = new Transport();
        Transport t1 = new Bus();
        Transport t2 = new Train();
        Transport t3 = new Flight();

        tt.travelMode();
        t1.travelMode();
        t2.travelMode();
        t3.travelMode();
    }
}