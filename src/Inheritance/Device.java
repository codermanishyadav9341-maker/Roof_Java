package Inheritance;

public class Device {
    String deviceName;

    Device(String deviceName){
        this.deviceName = deviceName;
    }

    public void showInfo(){
        System.out.println("DeviceName:- " +deviceName);
    }
}

class Mobile extends Device{
    String os;

    Mobile(String deviceName,String os){
        super(deviceName);
        this.os = os;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Operating System:- " +os);
    }

    public static void main(String[] args){
        Device dd = new Mobile("HP","Windows");
        dd.showInfo();

    }
}
