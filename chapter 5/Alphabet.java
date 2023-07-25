
public class Alphabet  {
    
    public static void main(String[] args) {
        
        // set to the first letter of alphabet 
        char letter = 'A';
        
        // creates a reference to an object that is
        // not yet instantiated, so that a lot of memory
        // is not consumed when we create an empty space 
        String blank = null;
        
        // to create columns
        int columns;
        
        // until lettter becomes Z, keep looping
        while (letter < 'Z') {
            
            // set to 0 in every iteration of outer loop
            // create new columns in each row
            columns = 0;
            
            // creates columns until letter equals Z
            // according to condition, they will be 9
            while (columns < 9) {
                
                // Ensures only alphabet letters are printed
                // else prints nothing 
                if (letter >= 'A' && letter <= 'Z') 
                    System.out.print(letter + "\t");
                else System.out.print(blank);
                
                // increments the current letter to the next one
                ++letter;
                
                // increments current column to form new column
                columns++;
            }
            
            // Ensures three spaces between rows
            System.out.print("\n\n");
        }
    }
    
}