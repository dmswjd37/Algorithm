import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int arr[] = new int[n];
        for(int a=0;a<n;a++)
            arr[a] = a+1;
        
        for(int b=0;b<m;b++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            
            while(i<j){
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        for(int arrs:arr)
            System.out.print(arrs+" ");
    }
}