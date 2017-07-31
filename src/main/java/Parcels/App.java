package Parcels;
import Parcels.Parcel;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 7/31/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("What is the length of the package?");
            int packageLength = Integer.parseInt(bufferedReader.readLine());
            System.out.println("What is the height of the package?");
            int packageHeight = Integer.parseInt(bufferedReader.readLine());
            System.out.println("What is the width of the package?");
            int packageWidth = Integer.parseInt(bufferedReader.readLine());
            System.out.println("What is the weight of the package?");
            int packageWeight = Integer.parseInt(bufferedReader.readLine());
            Parcel newParcel = new Parcel(packageWeight, packageLength, packageWidth, packageHeight);
            System.out.println("Your package dimensions are " + packageHeight + "x" + packageLength  + "x" +  packageWidth + "." + "Your package weighs:" + packageWeight);
            System.out.println("Your package's volume is: " + newParcel.Volume(packageLength, packageWidth, packageHeight));
            System.out.println("How quickly would you like to have the package delivered by: slow, medium, fast");
            String userSpeed = bufferedReader.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
