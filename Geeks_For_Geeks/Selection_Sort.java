package Geeks_For_Geeks;
import java.util.*;
public class Selection_Sort {
// { Driver Code Starts


    
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0)
            {
                int n = sc.nextInt();
                int arr[] = new int[n]; 
                for(int i=0;i<n;i++)
                {
                    arr[i] = sc.nextInt();
                }
            
                Solution obj = new Solution();
                obj.selectionSort(arr, n);
                
                for(int i=0;i<n;i++)
                    System.out.print(arr[i]+" ");
                System.out.println();
                t--;
            }
            
        }
    }
    // } Driver Code Ends
    
    
    class Solution
    {
        int  select(int arr[], int i)
        
        {
            int min=0;
            for(int k=0;k<i;k++){
            min=arr[k];
            for(int j=k+1;j<arr.length;j++){
                
                if(arr[k]>arr[j]){
                    min=arr[j];
                      int temp =min;
                arr[j]=arr[k];
                arr[k]=temp;
                }}
              
             
                
            }
             // System.out.println(min); 
            return min;
            // code here such that selectionSort() sorts arr[]
        }
        
        void selectionSort(int arr[], int n)
        {
           
                
                select(arr,n);
            
            //code here
        }
    }