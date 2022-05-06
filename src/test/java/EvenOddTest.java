import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddTest  {
    EvenOdd test = new EvenOdd();
    @Test
    public void NumIsEven(){
        assertEquals("Even",test.IsEvenOrOdd(10));
    }
    @Test
    public void NumIsOdd(){
        assertEquals("Odd",test.IsEvenOrOdd(9));
    }
    @Test
    public void NumIsNegativeEven(){
        assertEquals("Even",test.IsEvenOrOdd(-4));
    }
    @Test
    public void NumIsNegativeOdd(){
        assertEquals("Odd",test.IsEvenOrOdd(-3));
    }
}