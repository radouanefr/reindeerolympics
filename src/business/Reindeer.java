package business;

public class Reindeer {
    private String name;
    private int highSpeedCapacity;
    private int flyTimeCapacity;
    private int timeToRecoverEnergy;

    public  Reindeer(){

    }
    public  Reindeer(String name,int highSpeedCapacity,int flyTimeCapacity, int timeToRecoverEnergy){
        this.name=name;
        this.highSpeedCapacity=highSpeedCapacity;
        this.flyTimeCapacity=flyTimeCapacity;
        this.timeToRecoverEnergy=timeToRecoverEnergy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHighSpeedCapacity() {
        return highSpeedCapacity;
    }

    public void setHighSpeedCapacity(int highSpeedCapacity) {
        this.highSpeedCapacity = highSpeedCapacity;
    }

    public int getTimeToRecoverEnergy() {
        return timeToRecoverEnergy;
    }

    public void setTimeToRecoverEnergy(int timeToRecoverEnergy) {
        this.timeToRecoverEnergy = timeToRecoverEnergy;
    }

    public int getFlyTimeCapacity() {
        return flyTimeCapacity;
    }

    public void setFlyTimeCapacity(int flyTimeCapacity) {
        this.flyTimeCapacity = flyTimeCapacity;
    }

    @Override
    public String toString() {
        return "Reindeer{" +
                "name='" + name + '\'' +
                ", highSpeedCapacity=" + highSpeedCapacity +
                ", flyTimeCapacity=" + flyTimeCapacity +
                ", timeToRecoverEnergy=" + timeToRecoverEnergy +
                '}';
    }
}
