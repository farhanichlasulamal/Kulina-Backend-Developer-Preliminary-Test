package kulinatest;

import java.util.Scanner;
import java.util.Stack;

public class Algorithm2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hike bill = new Hike();
        
        int n = input.nextInt();
        if(n < 2 || n > 1000000){
            System.out.println("Invalid input");
            System.exit(0);
        }
        String s = input.next();
                
        int valleys = bill.countingValleys(n,s);
        System.out.println(valleys);
    }
    
}

class Hike{
    
    String[] set = new String[]{"U","D"};

    public int countingValleys(int n, String s){
        Stack<String> travel_stack = new Stack<>();
        String[] path = s.split("");
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(travel_stack.isEmpty()){
                travel_stack.push(path[i]);
            } else {
                if(path[i].equals(travel_stack.peek())){
                    travel_stack.push(path[i]);
                } else {
                    travel_stack.pop();
                    if(travel_stack.isEmpty() && path[i].equals(set[0])){
                        count++;
                    }
                }
            }
            System.out.println(travel_stack);
        }
        return count;
    }

}
