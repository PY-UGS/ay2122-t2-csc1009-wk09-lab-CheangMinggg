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
    public void allValuesShouldBePrimeNumber(){
        int value = R.getRandomDigitCharacter();
        if (value == 2 || value ==3){
            assertTrue(true);
        } else{
            assertFalse((value%2) == 0 || (value%3) == 0);
        }
    }
}
