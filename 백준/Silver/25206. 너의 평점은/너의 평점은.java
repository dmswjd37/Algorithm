import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	float sum = 0;
    	float cresum = 0;
    	float sco = 0;
    	for(int i=0;i<20;i++) {
    		st = new StringTokenizer(br.readLine());
    		String sub = st.nextToken();
    		float cre = Float.parseFloat(st.nextToken());
    		switch(st.nextToken()) {
    		case "A+":	sco=(float) 4.5;cresum += cre;break;
    		case "A0":	sco=(float) 4.0;cresum += cre;break;
    		case "B+":	sco=(float) 3.5;cresum += cre;break;
    		case "B0":	sco=(float) 3.0;cresum += cre;break;
    		case "C+":	sco=(float) 2.5;cresum += cre;break;
    		case "C0":	sco=(float) 2.0;cresum += cre;break;
    		case "D+":	sco=(float) 1.5;cresum += cre;break;
    		case "D0":	sco=(float) 1.0;cresum += cre;break;
    		case "F":	sco=(float) 0.0;cresum += cre;break;
    		case "P":	sco=(float) 0.0;break;
    		}
    		sum += (cre*sco);
    	}
        System.out.printf("%1.6f", sum/cresum);
    }
}