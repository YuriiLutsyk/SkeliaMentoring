import java.util.Arrays;

public class Array {

    public static void main(String[] args){
        int[] nums = new int[] { 1, 2, 3, 5 };
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min)
                min=nums[i];}
        System.out.println(min);
        min

    }
}

