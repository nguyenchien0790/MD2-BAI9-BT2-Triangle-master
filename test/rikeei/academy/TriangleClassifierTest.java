package rikeei.academy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("2-2-2")
    void testCheckTriangle222() {
        int a = 2;
        int b = 2;
        int c = 2;
        String result = TriangleClassifier.checkTriangle(a,b,c);
        String expect = "Tam giác đều";
        assertEquals(expect,result);
    }
    @Test
    @DisplayName("2-2-3")
    void testCheckTriangle223() {
        int a = 2;
        int b = 2;
        int c = 3;
        String result = TriangleClassifier.checkTriangle(a,b,c);
        String expect = "Tam giác cân";
        assertEquals(expect,result);
    }
    @Test
    @DisplayName("3-4-5")
    void testCheckTriangle345() {
        int a = 3;
        int b = 4;
        int c = 5;
        String result = TriangleClassifier.checkTriangle(a,b,c);
        String expect = "Tam giác thường";
        assertEquals(expect,result);
    }
    @Test
    @DisplayName("8-2-3")
    void testCheckTriangle823() {
        int a = 8;
        int b = 2;
        int c = 3;
        String result = TriangleClassifier.checkTriangle(a,b,c);
        String expect = "Không phải tam giác";
        assertEquals(expect,result);
    }
    @Test
    @DisplayName("-1-2-1")
    void testCheckTriangle121() {
        int a = -1;
        int b = 2;
        int c = 1;
        String result = TriangleClassifier.checkTriangle(a,b,c);
        String expect = "Không phải tam giác";
        assertEquals(expect,result);
    }
    @Test
    @DisplayName("0-1-1")
    void testCheckTriangle011() {
        int a = 0;
        int b = 1;
        int c = 1;
        String result = TriangleClassifier.checkTriangle(a,b,c);
        String expect = "Không phải tam giác";
        assertEquals(expect,result);
    }
}