package Polymorphism1;

public class VolumeCalculator {

    public void volume(int side){
        int cube = side*side*side;
        System.out.println("Volume of cube:- " +cube);
    }

    public void volume(int length,int breath,int height){
        int cuboid = length*breath*height;
        System.out.println("Volume of Cuboid:- " +cuboid);
    }

    public void Cylinder(double radius,double height){
        double cylinder = Math.PI*radius*radius*height;
        System.out.println("Volume of Cylinder:- " +cylinder);
    }

    public static void main(String[] args){
        VolumeCalculator vv = new VolumeCalculator();
        vv.volume(3);
        vv.volume(10,20,5);
        vv.Cylinder(2.5,10);

    }
}


