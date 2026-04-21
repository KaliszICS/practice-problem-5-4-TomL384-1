import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   @Test
   @DisplayName("")
   void isEvenTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isEven", cArg);
         assertEquals(true, (boolean) method.invoke(null, 4));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }
}
