import Tools.LoadReindeersFromFile;
import business.Race;
import business.Reindeer;

public class Launcher {
    public static void main(String[] args){
        Race race=new Race();

        /****************************/
        race.setName("Race with two candidates and duration 1000 sec");
        race.setDurationInSeconds(1000);

        Reindeer reindeer1=new Reindeer("Comet",14,10,127);
        Reindeer reindeer2=new Reindeer("Dancer",16,11,162);
        race.addReindeer(reindeer1);
        race.addReindeer(reindeer2);
        race.play();

        /****************************/
        race.setName("Race with two candidates and duration 2503 sec");
        race.setDurationInSeconds(2503);
        race.play();

        /****************************/
        race.setName("Race with two candidates and duration 2 sec");
        race.setDurationInSeconds(2);
        race.play();

        /****************************/
        race.setName("Race with multi candidates loaded from file and duration 2503 sec");
        race.setDurationInSeconds(2503);
        race.setAllReindeers(LoadReindeersFromFile.loadedList("src/reindeers.txt"));
        race.play();
        //Branch develop created
    }
}

