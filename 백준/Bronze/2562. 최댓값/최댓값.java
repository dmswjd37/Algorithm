import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i=0;i<9;i++){
            num = Integer.parseInt(br.readLine());
            if(max<num){
                max = num;
                maxIndex = i+1;
            }
        }
        System.out.println(max+"\n"+maxIndex);
    }
}