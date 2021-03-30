import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.util.*; 
import java.io.*;

public class solution {
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		FastReader s = new FastReader();
        StringBuilder sb = new StringBuilder();
		int n = s.nextInt();
           long[] a = new long[n];
           for(int i = 0; i<n ; i++)
           {
            a[i]= s.nextLong();
           }
           Arrays.sort(a);
           if(a[0] == a[n-1])
           {
           sb.append("0" + " " + n*(n-1)/2);
            }
            else{
                sb.append(a[n-1] - a[0]+ " ");
           long min_count = 0;
           long max_count = 0;
           long min = a[0];
           long max = a[n-1];
           for(int i = 0; i<n ; i++)
           {
            if(a[i] == min)
                min_count++;
            else if(a[i] == max)
                max_count++;
           }
           sb.append(min_count*max_count);
           }
           System.out.println(sb);
	}
}
