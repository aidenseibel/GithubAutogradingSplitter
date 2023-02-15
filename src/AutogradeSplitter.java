import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class AutogradeSplitter {
    public static void main(String[] args) {
        try{
            //read file
            File errorFile = new File("inputFile.txt");
            Scanner input = new Scanner(errorFile);
            String newline = input.nextLine();
            input.close();
    
            String[] arr = newline.split("%0A", 100);

            ArrayList<String> expected = new ArrayList<String>();
            ArrayList<String> actual = new ArrayList<String>();
            
            boolean actualFound = false;


            //parse
            int longest = 0;
            for(int i = 0; i < arr.length; i ++){
                if(arr[i].equals("Actual:")){
                    actualFound = true;
                }
                if(actualFound){
                    actual.add(arr[i]);
                }else{
                    expected.add(arr[i]);
                }
                if(arr[i].length() > longest && !actualFound){
                    longest = arr[i].length();
                }
            }

            //output
            for(int j = 0; j < expected.size(); j ++){
                System.out.print(expected.get(j));

                boolean matches = false;
                if(j != 0){
                    matches = (expected.get(j).equals(actual.get(j-1)));
                }

                int numSpaces = ((longest + 5) - expected.get(j).length());
                if(!matches){
                    numSpaces -= 2;
                }

                for(int spaces = 0; spaces < numSpaces; spaces ++){
                    System.out.print(" ");
                }
                if(!matches){
                    System.out.print("* ");
                }

                if(j != 0){
                    System.out.println(actual.get(j-1));
                }else{
                    System.out.println("");
                }
            }
    
        } catch (Exception e){
            System.out.println("No file exists.");
        }
    }
}