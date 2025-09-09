public class Second_largest_element {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,8,6,7,8,5};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max){
                max = arr[i];
                
            }
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> smax && arr[i]!= max){
                smax = arr[i];
                
            }
        }
        System.out.println(smax);
    }
}
