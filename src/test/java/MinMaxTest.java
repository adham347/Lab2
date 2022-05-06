import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class MinMaxTest {
    MinMax test =new MinMax();
    @Test
    public void Min(){
        int[] arr={1,7,10,3,5,20,40};
        assertEquals(1,test.min(arr));
    }
    @Test
    public void Max(){
        int[] arr={1,7,10,3,5,20,40};
        assertEquals(40,test.max(arr));
    }

}