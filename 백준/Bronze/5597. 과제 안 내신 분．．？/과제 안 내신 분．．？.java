import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr[] = new int[31];
        for(int i=1;i<=28;i++){
            int n = Integer.parseInt(br.readLine());
            arr[n] = n;
        }
        for(int j=1;j<=30;j++){
            if(arr[j] == 0)
                bw.write(j+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}