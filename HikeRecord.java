public class HikeRecord {
    private int elevation;
    private String hiker;
    private double hikeDistance;
    
    public HikeRecord(String hiker, int elevation, double hikeDistance) {
        this.elevation = elevation;
        this.hiker = hiker;
        this.hikeDistance = hikeDistance;
    }
    public String getHiker() { return hiker; }
    public double getHikeDistance() { return hikeDistance;}
    public double getElevation() { return elevation; }
    public String toString() {
        return hiker + " hiked up " + elevation + " ft!!!";
    }
}
