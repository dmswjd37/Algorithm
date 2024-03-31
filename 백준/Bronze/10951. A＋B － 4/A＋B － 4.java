import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while((s = br.readLine()) != null){
            bw.write((s.charAt(0)-48)+(s.charAt(2)-48)+"\n");
        }
        bw.flush();
        bw.close();
    }
}