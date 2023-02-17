import java.util.*;

public class Q412 {
    public List<String> FizzBuzz(int n){
        List<String> answer = new ArrayList<>(n);
        for(int i = 1; i <= n;i++){
            boolean divedeby3 = i % 3 == 0;            
            boolean divedeby5 = i % 5 == 0;            
            if(divedeby3 && divedeby5){
                answer.add("FizzBuzz");
            }else if(divedeby3){
                answer.add("Fizz");
            }else if(divedeby5){
                answer.add("Buzz");
            }else{
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
    public static void print(int )
    public static void main(String[] args) {
        int n = 5;
    }
}
