/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0736436_midterm_mads3464;

/**
 *
 * @author macstudent
 */
public class LambtonStringTools {
    
   static int j;
   static int c= 0;
   static int res;
   
   static void reverse  (String s)
   {
       char ch[] = new char[s.length()];
       for(j=0;j< s.length();j++)
       {
           ch[j] = s.charAt(j);
           
       }
         for(j=s.length()-1;j>=0;j--){
        System.out.print(ch[j]); 
        
      
}
   }
   
}
        
        
          

   
  
