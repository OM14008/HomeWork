package Class17;

import java.util.Scanner;

public class LapTop {
    String make;
    String model;
    double batteryLife;
    int storage;
    boolean camera;
    boolean touchPad;
    boolean touchScreen;

    public LapTop(String make,String model,double batteryLife,int storage,boolean camera,boolean touchPad,boolean touchScreen){
        this.make=make;
        this.model=model;
        this.batteryLife=batteryLife;
        this.storage=storage;
        this.camera=camera;
        this.touchPad=touchPad;
        this.touchScreen=touchScreen;
    }
    public LapTop(String make,String model,double batteryLife,int storage,boolean camera){
        this.make=make;
        this.model=model;
        this.batteryLife=batteryLife;
        this.storage=storage;
        this.camera=camera;

    }

    public static void main(String[] args) {
        LapTop lapTop = new LapTop("dell","g4",45,36,true);
        
    }
}
