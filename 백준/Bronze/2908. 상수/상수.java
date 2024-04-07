import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int max = 0;
    	for(int i=0;i<2;i++){
    		String s = st.nextToken();
    		StringBuilder sb = new StringBuilder(s);
    		int reverse = Integer.parseInt(sb.reverse().toString());
    		if(max<reverse)
    			max = reverse;
    	}
        System.out.println(max);
    }
}