/feature1

public class FindMax {
    public static void main(String[] args) {
        int[] numbers = {3,7,2};
        
        // Assume the first element is the largest
        int max = numbers[0]; 
        
        // Loop through the rest of the array to find a larger value
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("Maximum value: " + max);
    }
}

/this is omar from another branch