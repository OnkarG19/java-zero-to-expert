import java.util.List;

class GeometryCalculator{
    static double calculateArea(int choice, List<Double> arr){
        double value = 0.0;
        switch (choice) {
            case 1:
                value = Math.PI*arr.get(0)*arr.get(0);
                break;
        
            case 2:
            value = arr.get(0)*arr.get(1);
                break;
        }
        return value;
    }
}

public class AreaCalculation{
    public static void main(String[] args) {
        // Circle
        List<Double> circleInput = List.of(5.0);
        double circleArea = GeometryCalculator.calculateArea(1, circleInput);
        System.out.println("Area of Circle:" + circleArea);

        // Recatangle
        List<Double> rectangleInput  = List.of(6.0,7.0);
        double rectangleArea = GeometryCalculator.calculateArea(2, rectangleInput);
        System.err.println("Area of Rectangle:" + rectangleArea);
    }
}

// ctrl + /
// Given an integer choice denoting the choice of the user and a list containing the single value R or two values L and B depending on the choice.
// If the user's choice is 1, calculate the area of the circle having the given radius(R).  
// Else if the choice is 2, calculate the area of the rectangle with the given length(L) and breadth(B).

// Note : A list arr[], containing the single value R or the two values L and B, as input parameters. Return the area of the desired geometrical figure. Use Math.PI for the value of pi.

// Examples :

// Input: choice = 1, R = 5
// Output: 78.53981633974483
// Explaination: The choice is 1. So we have to calculate the area of the circle.