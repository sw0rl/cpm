import java.lang.Math;
import java.util.ArrayList;
import javafx.util.Pair;

public class Pi {

    public static ArrayList<Pair<Double, Double>> genPoints(int points, double length) {
        ArrayList<Pair<Double, Double>> pairs = new ArrayList<>();
        for (int i = 0; i < points; i++) {
            Pair<Double, Double> tempPair = new Pair<Double, Double>(Math.random()*length, Math.random()*length);
            pairs.add(tempPair);
        }
        return pairs;
    }

    public static double getDistance(Pair<Double, Double> point) {
        double distance = Math.sqrt(Math.pow(point.getKey(), 2) + Math.pow(point.getValue(), 2));
        return distance;
    }

    public static void main(String[] args) {
        ArrayList<Pair<Double, Double>> pointsXY = genPoints(10000, 10);
        
        int pointsInside = 0;
        double distance = 0;
        double ratio = 0;

        for (int i = 0; i < pointsXY.size(); i++) {
            Pair<Double, Double> point = pointsXY.get(i);
            distance = getDistance(point);
            if (distance <= 10) {
                pointsInside++;
            }
        }

        ratio = 4 * pointsInside / (double)pointsXY.size();
        
        System.out.println(ratio);
    }

}
