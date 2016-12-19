/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnasequencing;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ashish
 */
public class DNAsequencing {
    public void getInputString() throws FileNotFoundException, IOException{
        FileInputStream fstream = new FileInputStream("Textfile.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        while ((strLine = br.readLine()) != null)   {  
        getLongestCommonSeq(strLine);
    }
        br.close();        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        DNAsequencing d = new DNAsequencing();
        d.getInputString();
        
    }

    private void getLongestCommonSeq(String sequence) {
        int l = 1, max = 0;
        boolean invalid = false;
        char[] seqArr = sequence.toCharArray();
        char current = 0, maxChar = 0;
        for(int i=1; i < sequence.length(); i++){
            if(seqArr[i] == 'A' || seqArr[i] == 'a' || seqArr[i] == 'G' || seqArr[i] == 'g' ||
                    seqArr[i] == 'C' || seqArr[i] == 'c' || seqArr[i] == 'T' || seqArr[i] == 't'){
            if(seqArr[i] == seqArr[i-1]){
                l++;
                current = seqArr[i-1];
            }
            else
            {
                l = 1;
                
            }
            if(l >= max){
                max = l;
                maxChar = current;
            }
        }
            else
                invalid = true;
        }
        if(!invalid)
            System.out.println("For String "+sequence+" longest substring is\n "+maxChar+"  "+max);
        else
            System.out.println("The given string "+sequence+" is not a valid DNA sequence.");
    }
    
}
