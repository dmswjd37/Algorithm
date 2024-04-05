import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String s = br.readLine();
            int len = s.length()-1;
            sb.append(s.charAt(0)).append(s.charAt(len)+"\n");
        }
        System.out.println(sb);
    }
}