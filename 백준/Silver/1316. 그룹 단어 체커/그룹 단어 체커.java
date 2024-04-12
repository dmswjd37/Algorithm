import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	int count = 0;
        for(int i=0;i<n;i++) {
        	String s = br.readLine();
        	boolean check = true;
        	for(int j=0;j<s.length()-1;j++) {
        		if(s.charAt(j)!=s.charAt(j+1)) {
        			for(int k=0;k<=j-1;k++) {
        				if(s.charAt(j+1)==s.charAt(k)) {
        					check = false;
        					break;
        				}
        			}
        		}else
        			continue;
        	}
        	if(check)
        		count++;
        }
        System.out.println(count);
    }
}