/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplewebinput;

import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */
public class SimpleWebInput {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception
	{
		URL mcool = new URL("http://cs.leanderisd.org/mitchellis.txt");
                String one;
        try (Scanner webIn = new Scanner( mcool.openStream() )) {
            one = webIn.nextLine();
        }
		
		System.out.println(one);
	}
}
    

