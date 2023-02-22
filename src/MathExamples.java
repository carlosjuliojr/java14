import java.util.Random;

public class MathExamples {
    public static void main(String[] args) {
        int absolute = Math.abs(-3);
        System.out.println("absolute = " + absolute);

        absolute =  Math.abs(3);
        System.out.println("absolute = " + absolute);

        System.out.println("max value = " + Math.max(3,2));
        System.out.println("min value = " + Math.min(3.2,2.8));

        /**
         * rouns up
         */

        System.out.println("round ceil 2.5 = " + Math.ceil(2.5));
        System.out.println("round floor 2.5 = " + Math.floor(2.5));
        System.out.println("round 2.5 = "  + Math.round(2.5));
        System.out.println("PI = "  + Math.PI);

        /**
         * trigonometry
         */

        System.out.println("Math.exp(2)= "  + Math.exp(2));
        System.out.println("Math.log(10) = " + Math.log(10));
        System.out.println("Math.pow(3,3) = " + Math.pow(3,3));

        /**
         * Ramdon
         */

        Random random = new Random();
        System.out.println("random()*10 = "  + Math.random()*10);
        System.out.println("random.nextDouble() = " + random.nextDouble());
        System.out.println("random.nextInt() = " + random.nextInt());
        System.out.println("random.nextBoolean() = " + random.nextBoolean());
        
    }
}
