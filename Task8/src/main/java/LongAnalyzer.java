class LongAnalyzer {

    static byte countSingleBytes(long value){
        byte count = 0;
        for(long k = 0; k < Long.SIZE; ++k){
            if((value & (1L<<k)) != 0){
                ++count;
            }
        }
        return count;
    }

    static byte[] convertLongArrayToByteArray(long[] array){
        byte[] out = new byte[Long.BYTES*array.length];
        for(int i = 0; i < array.length; ++i){
            byte[] intermediate = convertLongToByteArray(array[i]);
            System.arraycopy(intermediate, 0, out, 8 * i, Long.BYTES);
        }
        return out;
    }

    static byte[] convertLongToByteArray(long value){
        byte[] out = new byte[Long.BYTES];
        for(int i = 0; i < Long.BYTES; ++i){
            out[i] = Long.valueOf(value >> 8*i).byteValue();
        }
        return out;
    }

    static long convertByteArrayToLong(byte[] in){
        long value = 0;
        for(int i = 0; i < Long.BYTES; ++i){
            value += (((long) in[i] & 0xff) << 8*i);
        }
        return value;
    }

    static long[] convertByteArrayToLongArray(byte[] array){
        int newArrayLength = array.length/Long.BYTES;
        long[] out = new long[newArrayLength];
        for(int i = 0; i < newArrayLength; ++i){
            byte[] intermediate = new byte[Long.BYTES];
            System.arraycopy(array, 8 * i, intermediate, 0, Long.BYTES);
            out[i] = convertByteArrayToLong(intermediate);
        }
        return out;
    }

}
