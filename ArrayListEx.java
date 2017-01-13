import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c;
        List<List<Character>> ls = new ArrayList<List<Character>>();
        List<Character> tm = new ArrayList<Character>(); 
        String tmp;
        boolean result = true;
        for (int i=0; i<n; i++){
            ls.clear();
            c = in.nextInt();
            //System.out.println(c);
            tmp = in.nextLine();
            for (int j =0; j<c; j++){
                tmp = in.nextLine();
                tm = new ArrayList<Character>();
                //System.out.println(tmp);
                for (int k=0; k<c; k++)
                    tm.add(tmp.charAt(k));
    
                Collections.sort(tm);
                ls.add(tm);
                //System.out.println(tm);
            }
            
            result = true;
            for (int j =0; j<c-1; j++){
                //System.out.println(ls);
                for (int k=0; k<c; k++){
                   if (ls.get(j).get(k) > ls.get(j+1).get(k)) result = false; 
                }
            }
            if (result) System.out.println("YES"); else System.out.println("NO");           
        }
        
    
    }
}
