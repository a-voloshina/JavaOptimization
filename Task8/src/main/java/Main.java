public class Main {

    public static void main(String[] args) {
        long value = 63;//9223372036854775807L;
        System.out.println(LongAnalyzer.countSingleBytes(value));

        byte[] valueArray = {2, 0, 0, 0, 0, 0, 0, 0,
                32, 0, 0, 0, 0, 0, 0, 0,
                -128, 0, 0, 0, 0, 0, 0,
                0, 0, 4, 0, 0, 0, 0, 0, 0};
        long[] result = LongAnalyzer.convertByteArrayToLongArray(valueArray);
    }

}
