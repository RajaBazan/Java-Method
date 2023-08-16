package hello.com;

public class JAVA_METHOD_31_Lec {
    static int logic(int x, int y){
        int z;
        if (x>y){                // In this logic we are applying a java method that is static logic that we are creating a logic in java method of if a is greater than b then it will simply add up both a and b in that logic
            z = x +y;
        }
        else {
            z = (x+y)*5;        // In this logic we are applying a java method that is static logic that we are creating a logic in java method of if a is  not greater than b then it will simply add up both a and b  and then multilply with a 5 in that log
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 12;   // In this logic we are applying a java method that is static logic that we are creating a logic in java method of if a is greater than b then it will simply add up both a and b
        int b = 122;
        int c;
        c = logic(a, b);

        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }

}