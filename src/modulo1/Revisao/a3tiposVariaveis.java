package modulo1;

public class a3tiposVariaveis {
    public static void main(String[] args) {
        //Bytes = 8bits 0-255 - 11111111
        byte idade = 127;
        byte min = Byte.MAX_VALUE;
        byte max = Byte.MIN_VALUE;
        // short 2 Bytes - 16 bits - 0-65535 - 1111111111111111
        short minS = Short.MIN_VALUE;
        short maxS = Short.MAX_VALUE;
        // Int 4Bytes - 32bits -0-131070 - 11111111111111111111111111111111
        int minI = Integer.MIN_VALUE;
        int maxI = Integer.MAX_VALUE;
        // Long 8Bytes - 64 bits - 0-4294967296 - 1111111111111111111111111111111111111111111111111111111111111111
        long minL = Long.MIN_VALUE;
        long maxL = Long.MAX_VALUE;

        System.out.println(minL);
        System.out.println(maxL);
    }
}
