package Polymorphism;

public class VolumeCalculator {

    public void Volume(int side){
        int cube = (side*side*side);
        System.out.println("Volume of Cube:- " +cube);
    }

    public void volume(int length,int breath,int height){
        int cuboid = (length*breath*height);
        System.out.println("Volume of Cuboid:- " +cuboid);
    }

    public void volume(double radius,double height){
        double cylinder = 3.14*radius*radius*height;
        System.out.println("Volume of Cylinder:- " +cylinder);
    }

    public static void main(String[] args){
        VolumeCalculator vv = new VolumeCalculator();
        vv.Volume(3);
        vv.volume(2,5,6);
        vv.volume(2.5,6);

    }
}


