/********************************************************************
 * Programmer:	  Kalia
 * Class:         CS30S
 *
 * Assignment:    Simple array example
 *
 * Description: brief description of program
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
   import java.io.*;
 import java.util.Random;
   import java.util.Scanner;

public class SimpleArrayExample {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
         
         final int MAXSIZE = 100;
    
    // ********** declaration of variables **********

        String strin;				// string data input from keyboard
        String strout;				// processed info string to be output
        String bannerOut;			// string to print banner to message dialogs

        String prompt;				// prompt for use in input dialogs

        String delim = "[ :]+";		// delimiter string for splitting input string
        String[] tokens;            // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
        
        int actualLength = 100;        // actual size of arry
        int list[] = new int[MAXSIZE]; 
    	
    // ***** create objects *******
    
        //Scanner scanner = new Scanner(System.in);
        //DecimalFormat df1 = new DecimalFormat("##.###");
        
      // file IO buffers, for reading data form a text file and writing output to 
      // a text file  
        //BufferedReader fin = new BufferedReader(new FileReader("demo1Data.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	Random rand = new Random();
    // ********** Print output Banner **********

        System.out.println("*******************************************");
        System.out.println("Name:		Anirudh");
        System.out.println("Class:		CS30S");
        System.out.println("Assignment:	Simple Array Example");
        System.out.println("*******************************************");

        bannerOut = "*******************************************" + nl;
        bannerOut += "Name:		Anirudh" + nl;
        bannerOut += "Class:		CS30S" + nl;
        bannerOut += "Assignment:	Simple Array Example" + nl;
        bannerOut += "*******************************************" + nl + nl;
        
        fout.print(bannerOut);		// prints the banner to the output text file
    	
    // ************************ get input **********************


    // ************************ processing ***************************
        
             // load an array with 50 randon number
             for(int i = 0; i < actualLength; i++){
                 list[i] = rand.nextInt(20);
                
             }    //end for loop to load array 

    // ************************ print output ****************************
      
        for(int i = 0; i < actualLength; i++){
            System.out.println(i + ".  " + list[i]);
                   
        }    //end for loop to load array
    
    // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.println("end of proecessing");
        
    // ***** close streams *****
        
        //fin.close();      // close input buffer stream
        fout.close();       // close output stream, note that nothing is printed 
        					// to the output file until the stream is closed		
        
    }  // end main
}  // end class
