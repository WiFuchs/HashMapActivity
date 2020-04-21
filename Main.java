// TODO: put your name up here

import java.util.*;

public class Main {
    
    // printMostPopularHike takes a map of strings to lists of HikeRecords and prints out
    // the most hiked mountain
    public static void printMostPopularHike(Map<String, List<HikeRecord>> hikes) {
        System.out.println("Fill in this function");
    }
    
    // printAverageHikeDistance takes a map of strings to lists of HikeRecords and prints out
    // the average distance hiked, over all of the mountains. Before adding your own hikes, it should print 3.67
    public static void printAverageHikeDistance(Map<String, List<HikeRecord>> hikes) {
        System.out.println("Fill in this function too");
    }

    public static void main(String[] args) {
        // initialize our HashMap
        Map<String, List<HikeRecord>> ourHikes = new HashMap();

        // fill out the hikes that we have gone on
        // TODO: add at least two of your own hikes to the map (they can be made up)
        ourHikes.put("Bishop",
            Arrays.asList(
                new HikeRecord("Mugen", 1546, 4.2),
                new HikeRecord("Will", 1546, 3.5)
            ));
        ourHikes.put("Madonna",
            Arrays.asList(
                new HikeRecord("Zeeshan", 1293, 4.0),
                new HikeRecord("Brian", 1293, 6.2),
                new HikeRecord("Felix", 1293, 6.2)
            ));
        ourHikes.put("The P",
            Arrays.asList(
                new HikeRecord("Felix", 829, 0.8),
                new HikeRecord("Mugen", 829, 0.8)
            ));
        // this must remain null
        ourHikes.put("The PCT", null);

        // an example of one way to iterate through the hashmap. Feel free to remove it, or keep it in, up to you
        for (Map.Entry<String, List<HikeRecord>> entry : ourHikes.entrySet()) {
            System.out.println(entry.getKey());
            List<HikeRecord> hikes = entry.getValue();
            if (hikes != null) {
                for (HikeRecord hike : hikes) {
                    System.out.println("\t" + hike);
                }
            }
        }

        // call the functions that print out the interesting stats about the hikes
        // TODO: fill out these functions
        printMostPopularHike(ourHikes);
        printAverageHikeDistance(ourHikes);
    }
}
