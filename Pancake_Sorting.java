import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pancake_Sorting {
    
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> list=new ArrayList<>();
        int start=0;
        int end=arr.length;
        int[] copy=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        Arrays.sort(copy);
        
            if(areEqual(copy,arr)){
                return list;
            }
        
            while(start<end){
                 int minValue=arr[0];
             int idx=0;

                for(int j=0;j<end;j++){

                  if(minValue>arr[j]){
                     
                     minValue=arr[j];

                      idx=j+1;  } }  

                
                if(idx==0){
                    if(start+1==end){
                        reverse(arr,arr.length);
                 list.add(arr.length) ;
                    }else{
                    reverse(arr,end);
                 list.add(end);
                    }
                }
                                                                                                                      else  if(idx!=0&&idx!=end){
                   list.add(idx);
                    list.add(end);
                  reverse(arr,idx);
                        reverse(arr,end);
                   
               }
           end--;
                
            }
       
       return list; 
    }
     public void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
     for(int i=0;i<b.length;i++){
         a[i]=b[i];
     }
     
     
     }
    public  boolean areEqual(int arr1[], int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;
        for (int i = 0; i < n; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }
}