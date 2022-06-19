public class FunctionCallingFromJava {
    public static void main(String[] args) {
//        int add = FunctionExpressionKt.add(10, 25);// by default, Kotlin function is static we can call Kotlin function directly by calling class name
        int add = First.add(15, 25);// we have annotated our file name via @file:JvmName("First") so we can call same function
        System.out.println(add);
    }
}
