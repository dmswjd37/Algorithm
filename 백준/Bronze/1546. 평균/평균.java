import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(max<arr[i])
                max = arr[i];
        }
        
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.print((float)sum/max*100/n);
    }
}