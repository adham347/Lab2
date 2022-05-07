import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class watchTest {
    watch test= new watch();

    @Test
    public void edgeCoverage(){
        assertEquals("Normal Time 2/2 2001 1:1",test.ModifyState("aacbabababababad"));
    }
    @Test
    public void ADUP(){
        assertEquals("Alarm Chime 2/2 2001 1:1",test.ModifyState("acbabababababa"));
    }

}