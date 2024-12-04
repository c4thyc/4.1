import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        //int odds = odds();
        //int evens = evens();
        //int g = greaterThanFiveHun();
        //int greatest = greatest();
        //int least = least();
        // int sum = sum();
        double mean = mean();
        System.out.println(mean);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException
    {
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext())
        {
            if (s.nextInt() % 2 == 0)
            {
                evens++;
            }
        }
        return evens;
    }

    public static int twoDigit() throws FileNotFoundException
    {
        s = new Scanner(f);
        String str = "";
        int twoDigit = 0;
        while (s.hasNext())
        {

            if (s.nextInt()  == 0)
            {
                evens++;
            }
        }
        return evens;
    }

    public static int greaterThanFiveHun() throws FileNotFoundException
    {
        s = new Scanner(f);
        int greaterThanFiveHun = 0;
        while (s.hasNext())
        {
            if (s.nextInt() > 500) greaterThanFiveHun++;
        }
        return greaterThanFiveHun;
    }

    public static int greatest() throws FileNotFoundException
    {
        s = new Scanner(f);
        int greatest = 0;
        while (s.hasNext())
        {
            if (s.nextInt() > greatest) greatest = s.nextInt();
        }
        return greatest;
    }

    public static int least() throws FileNotFoundException
    {
        s = new Scanner(f);
        int least = 249;
        while (s.hasNext())
        {
            if (s.nextInt() < least ) least = s.nextInt();
        }
        return least;
    }

    public static int sum() throws FileNotFoundException
    {
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext())
        {
            sum = sum + (s.nextInt());
        }
        return sum;
    }

    public static double mean() throws FileNotFoundException
    {
        s = new Scanner(f);
        double mean = 0;
        int count = 0;
        int sum = 0;
        while (s.hasNext())
        {
            sum = sum + (s.nextInt());
            count++;
        }
        mean = ((double)sum)/count;
        return mean;
    }

}
