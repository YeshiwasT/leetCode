package HackersRank;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Counting_Sort_1 {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    int[] frequency=new int[100];
    
    for(int i=0;i<arr.size();i++){
        
        if(frequency[arr.get(i)]!=0){
        frequency[arr.get(i)]++;
        }
        else{
            frequency[arr.get(i)]++;
        }
    }
    
    List<Integer> list = Arrays.stream(frequency)
      .boxed()
      .collect(Collectors.toList());
    
    return list;
        }
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    
            int n = Integer.parseInt(bufferedReader.readLine().trim());
    
            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
    
            List<Integer> result = Counting_Sort_1.countingSort(arr);
    
            bufferedWriter.write(
                result.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
                + "\n"
            );
    
            bufferedReader.close();
            bufferedWriter.close();
        }

}


