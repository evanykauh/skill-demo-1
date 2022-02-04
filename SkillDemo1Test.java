import static org.junit.Assert.*;
import org.junit.*;



public class SkillDemo1Test {
    
    @Test 
    public void testAddition(){
        assertEquals(13, SkillDemo1.add(5,8));
    }
}
