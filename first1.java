
import java.io.*;
import java.util.*;

public class first1 {
    public static void name(long[] dorm,long[] room) {
        long[] pre=new long[dorm.length];
        pre[0]=dorm[0];
        for(int i=1;i<pre.length;i++){
        pre[i]=dorm[i]+pre[i-1];
        }
        for (int i = 0; i < room.length; i++) {
           
        int start=0;
        int end=pre.length;
        
        while(start<end){
            int mid=start+(end-start)/2;
            if(room[i]<=pre[mid]){
                end=mid;
            }else{
                start=mid+1;
            }
       
        }
        System.out.println((start+1)+" "+(room[i]- ((start-1>=0)?pre[start-1]:0)));

        }
    }
    public static void main(String[] args) {
        
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){

                int n=in.nextInt();
       
             int[] arr=new int[n];

            for (int i = 0; i < arr.length; i++) {
                 arr[i]=in.nextInt();
          }
          int[] roomArr=new int[n];
            int j=n-1;
            int i=0;
            int k=0;
            int serja=0;
            int dima=0;
        int count=0;
         if(arr[i+1]>arr[i]){
            count++;
         }
         if(arr[j-1]>arr[j]){
            count++;
         }
          while(i<=j) {
            if(arr[i+1]<arr[i]&&arr[j-1]<arr[j]&&i==j){
               count++;
             }
            i++;
            j--;
      }
      if(count>1){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      }
  
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
    private final BufferedWriter bw;

    public FastWriter() {
      this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public void print(Object object) throws IOException {
      bw.append("" + object);
    }

    public void println(Object object) throws IOException {
      print(object);
      bw.append("\n");
    }

    public void close() throws IOException {
      bw.close();
    }
  }
    
}