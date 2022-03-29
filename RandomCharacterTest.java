import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RandomCharacterTest {
    RandomCharacter R = new RandomCharacter();
    
    @Test
    public void checkLowerCaseLetters(){
        
        assertTrue((int)((R.getRandomLowerCaseCharacter())) >= 97 );
        assertTrue((int)((R.getRandomLowerCaseCharacter())) <= 122 );
    } //test for lowercase method
    @Test 
    public void checkUpperCaseLetters(){ 
        RandomCharacter R = new RandomCharacter();
        assertTrue((int)((R.getRandomUpperCaseCharacter())) >= 65 );
        assertTrue((int)((R.getRandomUpperCaseCharacter())) <= 90 );
    }//Test uppercase 

    @Test 
    public void checkNumbers(){

        assertTrue(R.getRandomDigitCharacter() >= 0 );
        assertTrue(R.getRandomDigitCharacter() <= 9 );
    }//test for all digits method

    @Test 
    public void checkAllCharacters(){
        assertTrue(R.getRandomCharacter() >= 0 );
        assertTrue(R.getRandomCharacter() <= 127 );
    }//test for all characters method

    @Test //test for prime numbers method
    public void ValueBePrimeNumber(){
        int randomValue = R.getRandomDigitCharacter();
        boolean notPrime = false;
        if (randomValue == 0){
            notPrime = true;
        }
        else{
            // to check if randomValue is divisible by 2 and onwards
            for (int i = 2; i <= randomValue / 2 ; ++i){
                if (randomValue % i == 0){
                    notPrime = true;
                    break;
                }
            }
        }
        if (!notPrime){
            assertTrue(true);
        } else{
            assertFalse(true);
        }
    }
}



