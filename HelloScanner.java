import java.util.Scanner;

public class HelloScanner
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Name?");
        String name = keyboard.nextline();
        system.out.println("You are stinky, Mr. " + name);
        keyboard.close;
    }
}