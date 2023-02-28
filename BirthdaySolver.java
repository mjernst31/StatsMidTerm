import java.util.*;

/**
 * @author Matthew Ernst
 * @version 1.1
 */
class BirthdaySolver {
    static Random rand = new Random();

    /**
     * Generates random birthdates for a group of people and returns the chance of two people having the same birthdate.
     * @return the chance of two people in the group having the same birthdate
     * */
    public static double generateDates() {
        ArrayList<Integer> groupedCollection = new ArrayList<>();
        boolean run = true;

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

    public static void main(String[] args) {
        System.out.printf("Chance of 2 students sharing the same birhday in this simulation was %.2f%%",BirthdaySolver.generateDates());
    }
}