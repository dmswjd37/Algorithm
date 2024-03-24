import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        System.out.print(((B%10)*A)+"\n"+(((B/10)%10)*A)+"\n"+((B/100)*A)+"\n"+(A*B));
    }
}