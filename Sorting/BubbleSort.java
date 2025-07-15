package Sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] Marks = {10,9,8,5,2,7};
        int temp;
        for (int idx = 0; idx < Marks.length; idx++) {
             for (int j = 0; j < Marks.length-1-idx; j++) {
                if(Marks[j]>Marks[j+1]){
                    temp=Marks[j];
                    Marks[j]=Marks[j+1];
                    Marks[j+1]=temp;
                    

                }
                 
             }
            
        }
        System.out.println(Arrays.toString(Marks));
    }
    
}
