//http://javarevisited.blogspot.sg/2012/06/hashset-in-java-10-examples-programs.html

import java.io.*;
import java.util.*;

public class Solution
{
  
  private static int[] arr;
  private static void sort(int left, int right){
    if (left >= right) return;
    int v = arr[left];
    int i=left, j=right;
    int tmp;
    
    while (i<=j){
      while (arr[i] < v) i++;
      while (arr[j] > v) j--;
      if (i <= j){
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        i++;
        j--;
      }
      	
    }
    
    sort(left,j);
    sort(i,right);
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
