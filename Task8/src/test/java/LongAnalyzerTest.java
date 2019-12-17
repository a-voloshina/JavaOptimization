import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongAnalyzerTest {

    @Test
    void longToByteArrayTest1() {
        long testValue = 2;
        byte[] testResult = new byte[Long.BYTES];
        testResult[0] = 2;
        byte[] result = LongAnalyzer.convertLongToByteArray(testValue);
        assertArrayEquals(testResult, result);
    }

    @Test
    void longToByteArrayTest2() {
        long testValue = 128;
        byte[] testResult = new byte[Long.BYTES];
        testResult[0] = -128;
        byte[] result = LongAnalyzer.convertLongToByteArray(testValue);
        assertArrayEquals(testResult, result);
    }

    @Test
    void longToByteArrayTest3() {
        long testValue = 3293;
        byte[] testResult = new byte[Long.BYTES];
        testResult[0] = -35;
        testResult[1] = 12;
        byte[] result = LongAnalyzer.convertLongToByteArray(testValue);
        assertArrayEquals(testResult, result);
    }

    @Test
    void crossTestLongByteArray1(){
        long testValue = 2;
        byte[] result = LongAnalyzer.convertLongToByteArray(testValue);
        long value = LongAnalyzer.convertByteArrayToLong(result);
        assertEquals(testValue, value);
    }

    @Test
    void crossTestLongByteArray2(){
        long testValue = 3293;
        byte[] result = LongAnalyzer.convertLongToByteArray(testValue);
        long value = LongAnalyzer.convertByteArrayToLong(result);
        assertEquals(testValue, value);
    }

    @Test
    void longArrayToByteArray(){
        long[] valueArray = {2, 32, 128, 1024};
        byte[] result = LongAnalyzer.convertLongArrayToByteArray(valueArray);
        byte[] resultTest = {2, 0, 0, 0, 0, 0, 0, 0,
                32, 0, 0, 0, 0, 0, 0, 0,
                -128, 0, 0, 0, 0, 0, 0,
                0, 0, 4, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(resultTest, result);
    }

    @Test
    void byteArrayToLongArray(){
        byte[] valueArray = {2, 0, 0, 0, 0, 0, 0, 0,
                32, 0, 0, 0, 0, 0, 0, 0,
                -128, 0, 0, 0, 0, 0, 0,
                0, 0, 4, 0, 0, 0, 0, 0, 0};
        long[] result = LongAnalyzer.convertByteArrayToLongArray(valueArray);
        long[] resultTest = {2, 32, 128, 1024};
        assertArrayEquals(resultTest, result);
    }

    @Test
    void crossByteArrayLongArrayTest1(){
        long[] testArray = {2, 32, 128, 1024};
        byte[] result = LongAnalyzer.convertLongArrayToByteArray(testArray);
        long[] resultArray = LongAnalyzer.convertByteArrayToLongArray(result);
        assertArrayEquals(testArray, resultArray);
    }

    @Test
    void crossByteArrayLongArrayTest2(){
        long[] testArray = {35, 69, 255, 3547};
        byte[] result = LongAnalyzer.convertLongArrayToByteArray(testArray);
        long[] resultArray = LongAnalyzer.convertByteArrayToLongArray(result);
        assertArrayEquals(testArray, resultArray);
    }

    @Test
    void countSingleBytesInLong1(){
        long value = 9223372036854775807L;
        byte result = LongAnalyzer.countSingleBytes(value);
        byte resultTest = 63;
        assertEquals(resultTest, result);
    }

    @Test
    void countSingleBytesInLong2(){
        long value = 2;
        byte result = LongAnalyzer.countSingleBytes(value);
        byte resultTest = 1;
        assertEquals(resultTest, result);
    }

    @Test
    void countSingleBytesInLong3(){
        long value = 63;
        byte result = LongAnalyzer.countSingleBytes(value);
        byte resultTest = 6;
        assertEquals(resultTest, result);
    }
}
