import java.io.*;
import java.util.*;

public class Letters {
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
            int testCases=1;
            while(testCases-- > 0){

                int dorm=in.nextInt();
                int room=in.nextInt();
       
  long[] dormArr=new long[dorm];

            for (int i = 0; i < dormArr.length; i++) {
                 dormArr[i]=in.nextLong();
          }
          long[] roomArr=new long[room];

          for (int i = 0; i < roomArr.length; i++) {
           
             roomArr[i]=in.nextLong();
      }
    
      name(dormArr, roomArr);
  
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

















