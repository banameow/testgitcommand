public class TestGitCommand {
    public static int number = 201;
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        System.out.println(number > 200 ? "Number is greater than 200." : "Number is less than 200.");

        print2Times();
    }
    
    public static void print2Times() {
        System.out.println("Hi, this is 1 time(s)");
        System.out.println("Hi, this is 2 time(s)");
    }
}