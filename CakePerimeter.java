/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakeperimeter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Ashish
 */
public class CakePerimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
	 long Perimeter = Integer.MAX_VALUE;
	 //getting the area of the cake
	 BufferedReader in = new BufferedReader(new FileReader("Order.txt"));
	 String str;
	 ArrayList<String> list = new ArrayList<String>();
	 while((str = in.readLine()) != null){
	     list.add(str);
	 }
		
	 int n = Integer.parseInt(list.get(0));
	 
	 for (int i =1 ; i <= n; i ++)
	 {
		int area = Integer.parseInt(list.get(i));
		for( long l =1; l <= Math.sqrt(area); l++ )
		 {
		   if(area % l == 0)
		 {
		   if( 2*(l + (area/l)) < Perimeter)
		 {
		     Perimeter = 2*(l + (area/l));
		     
		   }
		     
		   } 
	 }
                System.out.println(Perimeter);
                Perimeter = Integer.MAX_VALUE;
	 
	}
	 
	 
	} catch (Exception e) {
			e.printStackTrace();
		}
	}

    }
    

