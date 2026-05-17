package Polymorphism_Practice;

public class Volume {
    public void volume(int side){
        System.out.println("Volume of Cube is:- " +(side*side*side));
    }

    public void volume(int height,int radius){
        System.out.println("Volume of Cylinder:- " +(Math.PI*radius*radius*height));
    }

    public static void main(String[] args){
        Volume vv = new Volume();
        vv.volume(10);
        vv.volume(10,5);

    }
}
