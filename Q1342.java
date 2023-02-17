
public class Q1342 {
    public static int step(int num){
        int count = 0;
        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
                count += 1;
            }else{
                num -= 1;
                count +=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 14;
        System.out.println(step(num));
    }
}