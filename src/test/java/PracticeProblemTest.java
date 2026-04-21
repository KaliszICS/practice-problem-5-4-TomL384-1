import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.lang.reflect.Method;

class PracticeProblemTest {

   // --- stringSwap() Tests ---

   @Test
   @DisplayName("stringSwap should swap two elements in a standard array")
   void stringSwapTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         String[] input = {"A", "B", "C", "D"};
         Class<?>[] cArg = { String[].class, int.class, int.class };
         Method method = testClass.getDeclaredMethod("stringSwap", cArg);
         method.invoke(null, (Object) input, 0, 2);
         
         String[] expected = {"C", "B", "A", "D"};
         assertArrayEquals(expected, input);
      } catch (NoSuchMethodException e) {
         fail("Method stringSwap does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("stringSwap should result in no change when indices are identical")
   void stringSwapTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         String[] input = {"A", "B", "C"};
         Class<?>[] cArg = { String[].class, int.class, int.class };
         Method method = testClass.getDeclaredMethod("stringSwap", cArg);
         method.invoke(null, (Object) input, 1, 1);
         
         String[] expected = {"A", "B", "C"};
         assertArrayEquals(expected, input);
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("stringSwap should swap two elements in a standard array")
   void stringSwapTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         String[] input = {"A", "B", "C", "D"};
         Class<?>[] cArg = { String[].class, int.class, int.class };
         Method method = testClass.getDeclaredMethod("stringSwap", cArg);
         method.invoke(null, (Object) input, 1, 3);
         
         String[] expected = {"A", "D", "C", "B"};
         assertArrayEquals(expected, input);
      } catch (NoSuchMethodException e) {
         fail("Method stringSwap does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   // --- reverse() Tests ---

   @Test
   @DisplayName("reverse should reverse an even-length integer array")
   void reverseTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         int[] input = {1, 2, 3, 4};
         Class<?>[] cArg = { int[].class };
         Method method = testClass.getDeclaredMethod("reverse", cArg);
         method.invoke(null, (Object) input);
         
         int[] expected = {4, 3, 2, 1};
         assertArrayEquals(expected, input);
      } catch (NoSuchMethodException e) {
         fail("Method reverse does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("reverse should reverse an odd-length integer array")
   void reverseTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         int[] input = {10, 20, 30};
         Class<?>[] cArg = { int[].class };
         Method method = testClass.getDeclaredMethod("reverse", cArg);
         method.invoke(null, (Object) input);
         
         int[] expected = {30, 20, 10};
         assertArrayEquals(expected, input);
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("reverse should handle an empty array without error")
   void reverseTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         int[] input = {};
         Class<?>[] cArg = { int[].class };
         Method method = testClass.getDeclaredMethod("reverse", cArg);
         method.invoke(null, (Object) input);
         
         int[] expected = {};
         assertArrayEquals(expected, input);
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   // --- toWordArray() Tests ---

   @Test
   @DisplayName("toWordArray should split a basic sentence into words")
   void toWordArrayTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("toWordArray", cArg);
         String[] result = (String[]) method.invoke(null, "Hello World");
         
         String[] expected = {"Hello", "World"};
         assertArrayEquals(expected, result);
      } catch (NoSuchMethodException e) {
         fail("Method toWordArray does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("toWordArray should remove empty strings from multiple spaces")
   void toWordArrayTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("toWordArray", cArg);
         String[] result = (String[]) method.invoke(null, "  Java   is fun  ");
         
         String[] expected = {"Java", "is", "fun"};
         assertArrayEquals(expected, result);
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("toWordArray should return an empty array for an empty string or just spaces")
   void toWordArrayTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("toWordArray", cArg);
         String[] result = (String[]) method.invoke(null, "   ");
         
         assertNotNull(result);
         assertEquals(0, result.length);
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("toWordArray single word test")
   void toWordArrayTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("toWordArray", cArg);
         String[] result = (String[]) method.invoke(null, "Hello");
         
         String[] expected = {"Hello"};
         assertArrayEquals(expected, result);
      } catch (NoSuchMethodException e) {
         fail("Method toWordArray does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }
}