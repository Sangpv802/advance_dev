import java.util.Random;

public class RandomNumbers
{
    public static void main(String[] args)
    {
        Random random = new Random(1000);

        for(int i = 0; i < 50; i ++ )
        {
            int number = random.nextInt(100);
            System.out.println(number + "");
            
            // if((i + 1) % 10 == 0)
            
            // {
            //     System.out.println();
            // }
        }
    }
}