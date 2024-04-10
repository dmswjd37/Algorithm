import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        int res = 1;
        for(int i=0;i<len/2;i++) {
        	if(s.charAt(i)!=s.charAt(len-1-i))
        		res = 0;
        }
        System.out.println(res);
    }
}