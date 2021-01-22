package kulinatest;

import java.util.Scanner;

public class Algorithm1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sock sock = new Sock();
        
        int n;
        int ar[];
        int n_matching_pairs;
        int limit_of_sock = 100;
        
        n = input.nextInt();
        if (n < 1 || n > limit_of_sock){
            System.out.println("Invalid number of sock.");
            System.exit(0);
        }
        
        ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = input.nextInt();
        }
        
        n_matching_pairs = sock.sockMerchant(ar);
        System.out.println(n_matching_pairs);
    }
}

class Sock {
    public int sockMerchant(int[] ar){
        int idx_pointer = 0;
        int idx_comparative = 1;
        int n_matching_pairs = 0;
        
        while(idx_pointer < (ar.length - 1)){
            if(ar[idx_pointer] == -1 || idx_comparative >= ar.length){
                idx_pointer++;
                idx_comparative = idx_pointer + 1;
            } else {
                while(idx_comparative < ar.length){
                    if(ar[idx_pointer] == ar[idx_comparative]){
                        ar[idx_pointer] = -1;
                        ar[idx_comparative] = -1;
                        
                        n_matching_pairs++;
                        idx_pointer++;
                        idx_comparative = idx_pointer + 1;
                        break;
                    }
                    idx_comparative++;
                    System.out.println("jj");
                }
            }
        }
        return n_matching_pairs;
    }
}
