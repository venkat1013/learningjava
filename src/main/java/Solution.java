// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
import java.util.ArrayList;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    static class PointAndList {
        List<List<Integer>> remainingLocations;
        List<Integer> pointToAdd;
        PointAndList(List<List<Integer>> remainingLocations, List<Integer> pointToAdd) {
            this.remainingLocations = remainingLocations;
            this.pointToAdd = pointToAdd;
        }
    }
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> ClosestXdestinations(int numDestinations,
                                             List<List<Integer>> allLocations,
                                             int numDeliveries)
    {
        // WRITE YOUR CODE HERE
        long distance = 0;
        Integer a[] = new Integer[] {0,0};
        List<Integer> source = new ArrayList<Integer>();
        source.add(0);
        source.add(0);
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        while(numDeliveries > 0) {
            PointAndList pointAndList = findPointAndReturnList(source, allLocations);
            resultList.add(pointAndList.pointToAdd);
            source = pointAndList.pointToAdd;
            allLocations = pointAndList.remainingLocations;
            numDeliveries--;
        }
        return resultList;
    }

    public static PointAndList findPointAndReturnList(List<Integer> source, List<List<Integer>> allLocations) {
        double min_distance = Double.MAX_VALUE;
        int index = -1;
        double distance;
        for(int i=0; i<allLocations.size(); i++) {
            List<Integer> point = allLocations.get(i);
            distance = findDistance(source,point);
            if(min_distance > distance) {
                min_distance = distance;
                index = i;
            }
        }
        List<Integer> point = allLocations.get(index);
        allLocations.remove(index);
        PointAndList pointAndList = new PointAndList(allLocations,point);
        return pointAndList;
    }

    public static double findDistance(List<Integer> source, List<Integer> point){
        return Math.sqrt((source.get(0) - point.get(0))*(source.get(0) - point.get(0)) + (source.get(1) - point.get(1))*(source.get(1) - point.get(1)));
    }
    // METHOD SIGNATURE ENDS
}