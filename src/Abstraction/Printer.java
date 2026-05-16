package Abstraction;

public interface Printer {
    void print(String documents);

}

class Injectprinter implements Printer{

    @Override
    public void print(String documents){
        System.out.println("InjectPrinter is printing......." +documents);
    }
}

class LaserPrinter implements Printer{

    @Override
    public void print(String documents){
        System.out.println("LaserPrinter is printing........" +documents);
    }

    public static void main(String[] args){
        Printer p1 = new Injectprinter();
        p1.print("Book");

        Printer p2 = new LaserPrinter();
        p2.print("Letter");


    }
}