public class PrimitiveVariables {
    public static void main(String[] args) {

        System.out.println("***************************************");
        System.out.println("***************Primitives**************");
        System.out.println("***************************************\n\n");

        System.out.println("***************************************");
        System.out.println("*************Primitive Byte************");
        System.out.println("***************************************");

        byte nbyte = 127;
        System.out.println("value: " + nbyte);
        System.out.println("Byte type in byte: " + Byte.BYTES);
        System.out.println("Byte type size: " + Byte.SIZE);
        System.out.println("Byte type max value: " + Byte.MAX_VALUE);
        System.out.println("Byte type min value: " + Byte.MIN_VALUE);

        System.out.println("***************************************");
        System.out.println("*************Primitive short***********");
        System.out.println("***************************************");

        short nShort = 3453;
        System.out.println("value: " + nShort);
        System.out.println("short type in byte: " + Short.BYTES);
        System.out.println("short type size: " + Short.SIZE);
        System.out.println("short type max value: " + Short.MAX_VALUE);
        System.out.println("short type min value: " + Short.MIN_VALUE);

        System.out.println("***************************************");
        System.out.println("*************Primitive int*************");
        System.out.println("***************************************");

        int nInt = 243423534;
        System.out.println("value: " + nInt);
        System.out.println("int type in byte: " + Integer.BYTES);
        System.out.println("int type size: " + Integer.SIZE);
        System.out.println("int type max value: " + Integer.MAX_VALUE);
        System.out.println("int type min value: " + Integer.MIN_VALUE);

        System.out.println("***************************************");
        System.out.println("************Primitive float************");
        System.out.println("***************************************");

        float nFloat = 3276e2f;
        System.out.println("value: " + nFloat);
        System.out.println("float type in byte: " + Float.BYTES);
        System.out.println("float type size: " + Float.SIZE);
        System.out.println("float type max value: " + Float.MAX_VALUE);
        System.out.println("float type min value: " + Float.MIN_VALUE);

        System.out.println("***************************************");
        System.out.println("*************Primitive long************");
        System.out.println("***************************************");

        long nLong = 6543;
        System.out.println("value: " + nLong);
        System.out.println("long type in byte: " + Long.BYTES);
        System.out.println("long type size: " + Long.SIZE);
        System.out.println("long type max value: " + Long.MAX_VALUE);
        System.out.println("long type min value: " + Long.MIN_VALUE);

        System.out.println("***************************************");
        System.out.println("*************Primitive char************");
        System.out.println("***************************************");

        char character = 'c';
        System.out.println("value: " + character);
        System.out.println("char type in byte: " + Character.BYTES);
        System.out.println("char type size: " + Character.SIZE);

        // Since java 10

        System.out.println("***************************************");
        System.out.println("*******Primitive var since java 10*****");
        System.out.println("***************************************");

        var variable = 127;
        System.out.println("value: " + variable);
        System.out.println(" type: " +  ((Object)variable).getClass().getSimpleName());
        System.out.println("***************************************");
        var variable2 = "Julio";
        System.out.println("value: " + variable2);
        System.out.println("type: " +  ((Object)variable2).getClass().getSimpleName());
        System.out.println("***************************************");
        var variable3 = 2.3;
        System.out.println("value: " + variable3);
        System.out.println("type: " +  ((Object)variable3).getClass().getSimpleName());
        System.out.println("***************************************");
        var variable4 = false;
        System.out.println("value: " + variable4);
        System.out.println("type: " +  ((Object)variable4).getClass().getSimpleName());
        System.out.println("***************************************");
        var variable5 = 'c';
        System.out.println("value: " + variable5);
        System.out.println("type: " +  ((Object)variable5).getClass().getSimpleName());

    }
}
