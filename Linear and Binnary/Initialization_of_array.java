public class Initialization_of_array {
    public static void main(String[] args) {
        int[] arr = {76, 88, 13, 82, 83};  // First way (direct initialization)

        int[] arr1 = new int[7];  // Declaring an array with size 7 (all elements default to 0)
        
        System.out.println(arr[3]); // Prints the 4th element: 82
        
        System.out.println("arr1 default values:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");  // Prints: 0 0 0 0 0 0 0
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i] + " ");  // Print all element of arr
        }
    }
}
