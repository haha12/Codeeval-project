/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codeval;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author nelson
 */
public class Codeval {

    /**
     * @param args the command line arguments
     */
public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[] split = line.split("\\s+");
            Collections.reverse(Arrays.asList(split));
            String result = "";
            for (String s : split) {
            result = result + s + " ";
                }
            result= result.trim();
            
            System.out.println(result);
        }
    }

    
}
