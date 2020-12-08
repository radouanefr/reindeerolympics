package business;

import java.util.ArrayList;

public class Race {
    String name;
    int durationInSeconds;
    ArrayList<Reindeer> reindeerList;

    public Race(){
        reindeerList=new ArrayList<>();
    }
    public Race(int durationInSeconds){
        reindeerList=new ArrayList<>();
        this.durationInSeconds=durationInSeconds;

    }
    public void addReindeer(Reindeer reindeer){
        reindeerList.add(reindeer);
    }

    public void setAllReindeers(ArrayList<Reindeer> newList){
        reindeerList=newList;
    }
    public void emptyCandidates(){
        reindeerList.clear();
    }

    public void play(){
        int atomicStep=0;
        int extraSeconds=0;
        int traveledDistance;
        Reindeer reindeerWinner=null;
        int maxTraveledDistance=0;

        System.out.println("\n###################### Start " +getName());

        for (Reindeer reindeerCandidate:reindeerList) {
            System.out.println("***** "+reindeerCandidate);

            atomicStep=durationInSeconds/(reindeerCandidate.getFlyTimeCapacity()+reindeerCandidate.getTimeToRecoverEnergy());
            System.out.println("Complete Step value = "+atomicStep);

            extraSeconds=durationInSeconds-(atomicStep*(reindeerCandidate.getFlyTimeCapacity()+reindeerCandidate.getTimeToRecoverEnergy()));

            if(extraSeconds>reindeerCandidate.getFlyTimeCapacity()){
                extraSeconds=reindeerCandidate.getFlyTimeCapacity();
            }

            System.out.println("Extra seconds = "+extraSeconds);
            traveledDistance=atomicStep*reindeerCandidate.getHighSpeedCapacity()*reindeerCandidate.getFlyTimeCapacity();
            traveledDistance+=extraSeconds*reindeerCandidate.getHighSpeedCapacity();

            System.out.println("complete traveled distance = "+traveledDistance);
            if(traveledDistance>maxTraveledDistance){
                maxTraveledDistance=traveledDistance;
                reindeerWinner=reindeerCandidate;
            }
        }
        if(reindeerWinner!=null)System.out.println("Congratulations for the winner "+reindeerWinner.getName());

        if(reindeerList.isEmpty())System.out.println("no candidates found for this race");
        System.out.println("###################### finished " +getName()+"\n");
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
