public class Datatypes {
    public static void main(String[] args) {
       
        byte byteDefault = 0;
        short shortDefault = 0;
        int intDefault = 0;
        long longDefault = 0L;
        float floatDefault = 0.0f;
        double doubleDefault = 0.0;

        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        float floatMax = Float.MAX_VALUE;
        double doubleMax = Double.MAX_VALUE;

        byte byteMin = Byte.MIN_VALUE;
        short shortMin = Short.MIN_VALUE;
        int intMin = Integer.MIN_VALUE;
        long longMin = Long.MIN_VALUE;
        float floatMin = Float.MIN_VALUE;
        double doubleMin = Double.MIN_VALUE;

        System.out.println("Data Type\tDefault Value\tMin Value\t\tMax Value");
        System.out.printf("byte\t\t%d\t\t%d\t\t\t%d%n", byteDefault, byteMin, byteMax);
        System.out.printf("short\t\t%d\t\t%d\t\t\t%d%n", shortDefault, shortMin, shortMax);
        System.out.printf("int\t\t%d\t\t%d\t\t%d%n", intDefault, intMin, intMax);
        System.out.printf("long\t\t%d\t\t%d\t%d%n", longDefault, longMin, longMax);
        System.out.printf("float\t\t%.1f\t\t%.1f\t\t\t%.1f%n", floatDefault, floatMin, floatMax);
        System.out.printf("double\t\t%.1f\t\t%.1f\t\t\t%.1f%n", doubleDefault, doubleMin, doubleMax);
    }
}


