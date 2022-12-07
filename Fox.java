import java.io.*;
import java.util.*;
/**
 * COPYRIGHT (C) 2022 Fox. All Rights Reserved.
 * Solves CS203 Assignment "What does the fox truly say"
 * @author Tyler Mui
 * @version 1.01 2022-09-12
 */

public class Fox {
public static void main(String [] args ) throws IOException {
    Scanner input = new Scanner(System.in); 
    //create Arraylists to store the information
    ArrayList<String> Recordings = new ArrayList<String>(); 
    ArrayList<String> KnownSounds = new ArrayList<String>(); 
    
    int NumOfRecordings = Integer.parseInt(input.nextLine()); //takes in the amount of recordings
    for(int i = 0; i < NumOfRecordings; i++)//take in the whole line of recording and assigning to position i
    {
        Recordings.add(input.nextLine()); 
    }

    while(true)//checks for the known noises and adds to KnownSounds ArrayList
    {
        String Noises = input.nextLine(); 
        if(Noises.equalsIgnoreCase("what does the fox say?"))
        {
            break; 
        }
        String splitNoises [] = Noises.split(" "); 
        KnownSounds.add(splitNoises[2]); 
    }//end while loop 

    for(int i = 0; i < Recordings.size(); i++)//prints the output of Recordings minus KnownSounds
    {
        String[] splitRecording = Recordings.get(i).split(" "); 
        ArrayList<String> temporary = new ArrayList<String>(); 
        for (int j = 0; j < splitRecording.length; j++)//splitting the recording into each individual word
        {
            temporary.add(splitRecording[j]); 
        }
        temporary.removeAll(KnownSounds);//remove all positions that match in KnownSounds
        for(int k = 0; k < temporary.size(); k++)//print what the fox says
        {
            if(k != temporary.size() - 1)
            {
                System.out.print(temporary.get(k) + " "); 
            }
            else
            {
                System.out.print(temporary.get(k)); 
            }
        }
        System.out.println(); 
    }//end output for loop

}//end main method
}//end class method
//the best ideas come as jokes make your thinking as funny as possible david ogilvy