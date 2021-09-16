// Write a static block which will be executed before main( ) method in a class
class Practical_9 {
    static {
        System.out.println("This is the main static function executed before Main Functon");
    }
    public static void main(String[] args) {
        System.out.println("This is the Main Methord");
    }
}
