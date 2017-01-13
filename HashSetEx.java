//http://javarevisited.blogspot.sg/2012/06/hashset-in-java-10-examples-programs.html

import java.util.HashSet;
import java.util.Iterator;


public class Solution
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    HashSet <Integer> s = new HashSet<Integer>(); //Make a new set.
    s.add(1); //Add
    if (s.contains(1)) s.add(3); //contains
    int n = s.size(); //size
    s.remove(1); //remove
    System.out.println(s.remove(4)); //removing a non-existant element returns false.
    System.out.println(s); //print
    
    Object[] a = s.toArray(); //convert to array.
    System.out.println(a[0]);
    
    Iterator<Integer> i = s.iterator(); //HashSet iterator
    while (i.hasNext()) i.next(); // hasNext and next for iterator
    
    HashSet <Integer> s2 = new HashSet<Integer>();
    s2.addAll(s); //merge to sets by addAll.
    
    s.clear(); // clear the set.
      
  }
}
