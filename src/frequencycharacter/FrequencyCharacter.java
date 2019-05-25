
package frequencycharacter;
import java.util.Scanner;
/**
 * Java Program to find the frequency of characters
In this program, we need to find the frequency of each character present in the word.
 *
 * @author Alireza Hassanpour
 */
public class FrequencyCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter charecters : ");
        String str = sc.next();    
        int[] freq = new int[str.length()];    
        int i, j;    
            
        //Converts given string into character array    
        char string[] = str.toCharArray();    
            
        for(i = 0; i <str.length(); i++) {    
            freq[i] = 1;    
            for(j = i+1; j <str.length(); j++) {    
                if(string[i] == string[j]) {    
                    freq[i]++;    
                        
                    //Set string[j] to 0 to avoid printing visited character    
                    string[j] = '0';    
                }    
            }    
        }    
            
        //Displays the each character and their corresponding frequency    
        System.out.println("Characters and their corresponding frequencies");    
        for(i = 0; i <freq.length; i++) {    
            if(string[i] != ' ' && string[i] != '0')    
                System.out.println(string[i] + "-" + freq[i]);    
        }    
    
    }
    
}
