package Abstraction;

abstract class Game {

    abstract String play();

    void starts(){
        System.out.println("Games Starts");
    }
}

class Cricket extends Game{

    String play(){
        return "Playing Crickets";
    }

}

class Chess extends Game{

    String play(){
        return "Playing Chess";
    }

    public static  void main(String[] args){
        Game g1 = new Cricket();
        Game g2 = new Chess();

        System.out.println(g1.play());
        System.out.println(g2.play());

    }
}
