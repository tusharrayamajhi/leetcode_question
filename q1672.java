
public class q1672 {
    public static int RCW(int nums[][]) {
        int  rich = 0;
        for(int i = 0;i<nums.length;i++){
            int wealth = 0;
            for(int  j = 0; j< nums[0].length;j++){
                wealth += nums[i][j];
            }
           rich = Math.max(wealth, rich);
        }
        return rich;
    }

    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(RCW(nums));
    }
}