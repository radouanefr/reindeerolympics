package Tools;

import business.Reindeer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadReindeersFromFile {

    private int highSpeedCapacity;
    private int flyTimeCapacity;
    private int timeToRecoverEnergy;

    public static  ArrayList<Reindeer> loadedList(String fileName){
        ArrayList<Reindeer> reindeerArrayList=new ArrayList<>();
        Reindeer reindeer=null;
        String line=null;

        try {
            Scanner scanner = new Scanner(new File(fileName));
            System.out.println("Start loading candidates from file ...");
            while (scanner.hasNextLine()) {

                line=scanner.nextLine();
                //System.out.println(line);
                String[] elements=line.split(",");
                if(elements.length==4){
                    try {
                        reindeer=new Reindeer(elements[0],Integer.valueOf(elements[1]),Integer.valueOf(elements[2]),Integer.valueOf(elements[3]));
                        reindeerArrayList.add(reindeer);
                        System.out.println("Reinder load successfully "+reindeer.getName());
                    }catch (NumberFormatException e){
                        System.out.println("Error when converting values for " +elements[0]);
                    }

                }
            }
            scanner.close();
            System.out.println("End loading candidates from file ...");
        } catch (FileNotFoundException e) {
            System.out.println("Error when loading file " +fileName);
        }

        return reindeerArrayList;
    }
}
