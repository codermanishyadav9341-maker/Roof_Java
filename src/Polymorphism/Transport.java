package Polymorphism;

public class Transport {

    public void travelMode(){
        System.out.println("Travelling");
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
        tt.travelMode();

        Transport t1 = new Bus();
        t1.travelMode();

        Transport t2 = new Train();
        t2.travelMode();

        Transport t3 = new Flight();
        t3.travelMode();

    }
}
