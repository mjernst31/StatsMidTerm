/**
 * @author Matthew Ernst
 * @version 1.1
 */

import java.util.*;
class BirthdaySolver {
    static Random rand = new Random();

    /**
     * Calculates the chance of 2 people sharing the same birthday.
     * @return the chance of two people in a group having the same birthday
     * */
    public static double generateDates() {
        ArrayList<Integer> groupedCollection = new ArrayList<>();
        boolean run = true;

        //Generates different dates, throws them into the array, and keeps adding dates until 2 match. Then it returns the chance of that happening.
        groupedCollection.add(rand.nextInt(365) + 1);
        while (run) {
            for (int i = 0; i < groupedCollection.size(); i++) {
                for (int j = 0; j < groupedCollection.size(); j++) {
                    if ((i != j) && (groupedCollection.get(i).equals(groupedCollection.get(j)))) {
                        return (1.0/groupedCollection.size()) * 100;
                    }
                }
            }

            groupedCollection.add(rand.nextInt(365) + 1);
        }

        return (1.0/groupedCollection.size()) * 100;
    }
}