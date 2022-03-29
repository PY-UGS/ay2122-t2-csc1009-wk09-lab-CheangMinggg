import java.util.Arrays;
import java.util.Random;

public class RandomCharacter {
    Random r = new Random();

    public char getRandomLowerCaseCharacter(){
        char smallerChar = (char)('a' + r.nextInt(26)); //random lower case letter
        return smallerChar;
    }

    public char getRandomUpperCaseCharacter(){
        char biggerChar = (char) ('A' + r.nextInt(26));
        return biggerChar;
    } //random upper case character
   
    public int getRandomDigitCharacter() {
        int RandNo = r.nextInt(10);
        return RandNo;  //random digit 
    }

    public char getRandomCharacter(){ 
        char randomChar = 0;
        randomChar = (char)(r.nextInt(128));
        return randomChar;
    }//method to get random character

    public static void main(String[] args) {
        
        RandomCharacter rnd = new RandomCharacter();

        int i = 0;
        char[] smallerCharArray = new char[15];
        char[] biggerCharArray = new char[15];
        int [] randomNoArray = new int[15];
        char[] randomCharArray = new char[15];
        
        //generate random character 
        for (i = 0; i<15 ; i++){
            smallerCharArray[i] = rnd.getRandomLowerCaseCharacter(); 
        }

        for (i = 0; i<15 ; i++){
            biggerCharArray[i] = rnd.getRandomUpperCaseCharacter();
        }

        for (i = 0; i<15 ; i++){
            randomNoArray[i] = rnd.getRandomDigitCharacter();
        }

        for (i = 0; i<15 ; i++){
            randomCharArray[i] = rnd.getRandomCharacter();
        }

        System.out.println("15 Lowercase character values: " + Arrays.toString(smallerCharArray));
        System.out.println("15 Uppercase character values: " + Arrays.toString(biggerCharArray));
        System.out.println("15 random character values: " + Arrays.toString(randomCharArray));
        System.out.println("15 random numbers between 0-9: " + Arrays.toString(randomNoArray));
       

    }
}
