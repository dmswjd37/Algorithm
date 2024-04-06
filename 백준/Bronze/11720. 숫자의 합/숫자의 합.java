import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
        String nArr = br.readLine();
        int sum = 0;
        for(String s:nArr.split("")){
            sum += Integer.parseInt(s);
        }
	    System.out.println(sum);
	}
}