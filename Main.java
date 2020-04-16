import java.util.*;

public class Main {
    public static void main(String[] args) {
        // initialize our HashMap
        Map<String, List<HikeRecord>> ourHikes = new HashMap();
        System.out.println(ourHikes.getClass().getName());
        // fill out the hikes that we have gone on
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

        // iterate through and print the hikes
        // is this too much to be giving them?
        for (Map.Entry entry : ourHikes.entrySet()) {
            System.out.println(entry.getKey());
            //DOES ANYONE KNOW HOW TO GET RID OF THIS CAST I DONT GET IT 
            List<HikeRecord> hikes = (List<HikeRecord>)entry.getValue();
            if (hikes != null) {
                for (HikeRecord hike : hikes) {
                    System.out.println("\t" + hike.getHiker());
                }
            }
        }
    }
}