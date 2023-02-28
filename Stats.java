/**
 * @author Matthew Ernst
 * @version 1.1
 */

import java.util.*;
public class Stats{
    /**
     * Homemade function to round a double to 2 decimal places to make calculations within this class look nicer.
     * @param roundThis the number that will be rounded
     * @return returns the rounded number
     */
    public static double round(double roundThis) {
        return (double)Math.round(roundThis * 100) / 100;
    }

    /**
     * Calculates the average of a given ArrayList of doubles
     * @param collection the array that will be looked at when finding the average
     * @return returns the average of collection
     */
    public static double average(ArrayList<Double> collection) {
        double total = 0;
        int index;

        if(collection.size() > 1)
        {
            for (index = 0; index < collection.size(); index++)
                total = total + collection.get(index);


            total = total/collection.size();
            return round(total);
        }

        System.out.println("Array had no data set, returning 0, please try again.");
        return 0;
    }

    /**
     * Finds the median of the sent array.
     * @param collection array that is looked at to find the median
     * @return the median as a double, if it cant be found returns 0.
     */
    public static double median(ArrayList<Double> collection) {
        Collections.sort(collection);

        if(collection.size() % 2 == 1)
            return round((collection.get(collection.size() / 2)));

        System.out.println("Median can not be found... either the array is even elements long, or 0 elements long. Returning 0.");
        return 0;
    }

    /**
     * Calculates the standard deviation of a sent arrayList
     * @param collection the arrayList that is being looked at to find the standard deviation
     * @return the standard deviation in double form
     */
    public static double standardDev(ArrayList<Double> collection) {
        double averageCalc, returnSTD = 0;// (/❛o❛\)
        int index;

        if(collection.size() > 1)
        {
            averageCalc = average(collection);

            for(index = 0; index < collection.size(); index++)
                returnSTD = returnSTD + Math.pow((collection.get(index) - averageCalc), 2) ;

            returnSTD = returnSTD / collection.size();
            return round(Math.sqrt(returnSTD));
        }

        System.out.println("Data Set was not long enough. Returning 0, please try again.");
        return 0;
    }
}
