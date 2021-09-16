// Write a program in Java to develop user defined exception for 'Divide by Zero' error.
class MyException extends Exception {
    private int ex;

    MyException(int b) {
        ex = b;
    }

    public String toString() {
        return "Exception :  Divide by Zero " + ex;
    }
}

class Practical_24 {
    static void divide(int a, int b) throws MyException {
        if (b <= 0) {
            throw new MyException(b);
        } else {
            System.out.println("Division : " + a / b);
        }
    }

    public static void main(String arg[]) {
        try {
            divide(10, 0);
        } catch (MyException me) {
            System.out.println(me);
        }
    }
}