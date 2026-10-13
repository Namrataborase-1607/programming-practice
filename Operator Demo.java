public class OperatorsDemo {
    void add(int a, int b){
        int sum = a + b;
        System.out.println("Addition:" + sum);
    }
    int multiplay(int a, int b){
        return a* b;
    }

    public static void main(String[] args){
        int x = 20 , y= 4;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y =" +(x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        byte a = 20, b = 30;
        int result = a + b;
        System.out.println("Arithmetic Promotion Result:" + result);

        OperatorsDemo obj = new OperatorsDemo();
        obj.add(a: 5, b: 7);
        int product = obj.multiply(a: 4, b:6);
        System.out.println("Multiplication:" + product);
    }
}
