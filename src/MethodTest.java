import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MethodTest {
    @BeforeAll
    public static void setAllUp() {
        System.out.println("--- UNIT TESTING IS STARTED ---");
    }
    @AfterAll
    public static void tearAllDown() {
        System.out.println("--- UNIT TESTING IS DONE ---");
    }
    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Test case is starting...");
    }
    @AfterEach
    public void afterEachTest() {
        System.out.println("Test case is finishing...");
    }

    @Test
    public void sumTest() {
        Methods obj = new Methods();

        int actual = obj.sum(2, 2);
        int expected = 4;

//        Assertions
        assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        Methods obj = new Methods();
        String actual = obj.reverse("Zukkii");
        String expected = "iikkuZ";

        assertEquals(expected, actual);
    }

    @Test
    public void isEventTest() {
        Methods obj = new Methods();
        boolean actual = obj.isEvent(1234);
//        boolean expect = true;

//        assertEquals(expect, actual);
        assertTrue(actual); // <--- for boolean
    }

    @Test
    public void isOddTest() {
        Methods obj = new Methods();
        assertFalse(obj.isEvent(123));
    }

    @Test
    public void revArrTest() {
        Methods obj = new Methods();

        int[] testArr = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(testArr));

        int[] expected = {9, 7, 5, 3, 1};
        obj.revArr(testArr);
        System.out.println(Arrays.toString(testArr));

        assertArrayEquals(expected, testArr);
    }

    @Test
    public void firstLastTest() {
        Methods obj = new Methods();
        int[] testArr = {12345, 2332, 22, 4325};
        int[] expected = {4325, 2332, 22, 12345};
        obj.firstLast(testArr);
        assertArrayEquals(expected, testArr);
    }


}
