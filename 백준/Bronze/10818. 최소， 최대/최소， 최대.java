import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int num = 0;
        for(int i=0;i<n;i++){
            num = Integer.parseInt(st.nextToken());
            if(min>num)
                min = num;
            if(max<num)
                max = num;
        }
        System.out.println(min+" "+max);
    }
}