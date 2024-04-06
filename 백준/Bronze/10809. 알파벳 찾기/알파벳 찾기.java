import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int arr[] = new int[26];
        for(int i=0;i<arr.length;i++)
            arr[i] = -1;
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i);
            if(arr[c-97]==-1)
            	arr[c-97] = i;
        }
        for(int arrs:arr)
            sb.append(arrs+" ");
	    System.out.print(sb);
    }
}