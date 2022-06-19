public class FunctionCallingFromJava {
    public static void main(String[] args) {
//        int add = FunctionExpressionKt.add(10, 25);// by default, Kotlin function is static we can call Kotlin function directly by calling class name
        int add = First.add(15, 25);// we have annotated our file name via @file:JvmName("First") so we can call same function
        System.out.println(add);

        System.out.println(First.calcAmount(100, 0.08));

        System.out.println(First.calcAmount(50));// we have annotated calcAmount method with @JvmOverloads, so we don't need to pass interest value


    }
}
