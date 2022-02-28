package HackersRank;


import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Insertion_Sort_Part_1 {
    


    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
    int lastElement=arr.get(n-1);
    
        for (int i = 1; i <= n; i++) {
            int index= (n-i-1<0)?0:n-i-1;
            if (n-i-1<0) {
                arr.set(n-i, lastElement);
                          for (int j=0;j<n;j++) {
           System.out.print(arr.get(j)+" ");
           
       }
       System.out.println();
          
            }
          else  if (arr.get(index)>lastElement) {
                arr.set(n-i, arr.get(index));
                     for (int j=0;j<n;j++) {
           System.out.print(arr.get(j)+" ");
           
       }
       System.out.println();
                
            } else {
                arr.set(n-i, lastElement);
                     for (int j=0;j<n;j++) {
           System.out.print(arr.get(j)+" ");
           
           
       }
           System.out.println();
    
    break;

    }}}

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

            Insertion_Sort_Part_1.insertionSort1(n, arr);

        bufferedReader.close();
    }


}


