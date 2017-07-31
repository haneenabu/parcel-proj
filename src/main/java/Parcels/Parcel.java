package Parcels;


/**
 * Created by Guest on 7/31/17.
 */
public class Parcel {
    public int weight;
    public int length;
    public int width;
    public int height;

    public Parcel (int weight, int length, int width, int height){
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int Volume(int length, int width, int height){
        return (length * width * height);
    }

    public double CostToShip(int packageWeight, int speed, int distance){
        if (speed.equals("fast")) {
            int intSpeed = 3;
        }else if (speed.equals("medium")){
            int intSpeed = 2;
        }else if (speed.equals("slow")){
            int intSpeed = 1;
        }
        return ((packageWeight*0.01) + intSpeed + (distance*.03));
    }
}
