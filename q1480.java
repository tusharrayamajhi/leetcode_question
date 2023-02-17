public class q1480{
    public static int[] Running_sum_array(int nums[]){
        for(int i = 1; i < nums.length;i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    //print array
    public static void Print(int nums[]){
        for(int i = 0; i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        Running_sum_array(nums);
        Print(nums);//result = 1,3,6,10

    }
}