public class MountainHike {
    private int elevation;
    private String name;
    private double hikeDistance;
    
    public MountainHike(String name, int elevation, double hikeDistance) {
        this.elevation = elevation;
        this.name = name;
        this.hikeDistance = hikeDistance;
    }
    public String getName() { return name; }
    public double getHikeDistance() { return hikeDistance;}
    public double getElevation() { return elevation; }
    public String toString() {
        return name + " : " + elevation + "ft";
    }
}
