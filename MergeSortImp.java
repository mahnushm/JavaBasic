//http://javarevisited.blogspot.sg/2012/06/hashset-in-java-10-examples-programs.html

import java.io.*;
import java.util.*;

public class Solution
{
  
  private static int[] arr;
  private static void sort(int left, int right){
    if (left >= right) return;
    sort(left,(left+right)/2);
    sort((left+right)/2+1,right);
    merge(left,right);
  }
  
  private static void merge(int left, int right){
  	int size = right - left +1;
    int middle = (right+left)/2 +1;
    int[] tmp = new int[size]; 
    int t = 0;
    int i = left;
    int j = middle;
    
    while ((i< middle) && (j<right+1) ){
      if (arr[i] <=arr[j]) tmp[t++] = arr[i++];
      else tmp[t++] = arr[j++];
    }
    
    while (i < middle) tmp[t++] = arr[i++];    
    while (j < right+1) tmp[t++] = arr[j++];
    
    for (int k =0; k<size; k++) arr[left+k] = tmp[k];
  
    
  }
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    //Scanner in = new Scanner(System.in);
    int n = 10;
    int[] input ={5,5,5,4,4,1,7,8,9,0};
    arr=input;
    sort(0,n-1);
    
    for (int i=0; i<n; i++){
      System.out.print(arr[i]);
      System.out.print(' ');
    }
      
  }
}
