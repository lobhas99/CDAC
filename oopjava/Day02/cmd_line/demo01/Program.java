class Program {
    public static void main(String[] args) {
        System.out.println("Hello");

        System.out.println("args[0] = " + args[0]);
        System.out.println("args[1] = " + args[1]);
        int num1 = Integer.parseInt(args[0]); // unboxing
        Integer i1 = Integer.valueOf(args[1]); //
        int num2 = i1;// auto unboxing
        System.out.println(args[0] + args[1]);
        System.out.println("Addition = " + (num1 + num2));
    }
}