import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	String arr[][] = new String[5][15];
    	for(int i=0;i<arr.length;i++){
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String s = st.nextToken();
	        for(int j=0;j<s.length();j++){
	        	arr[i][j] = Character.toString(s.charAt(j));
	        }
        }
    	for(int i=0;i<15;i++){
    		for(int j=0;j<arr.length;j++){
    			if(arr[j][i]!=null)
    				sb.append(arr[j][i]);
    		}
    	}
    	System.out.print(sb);
    }
}