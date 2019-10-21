public class task33 {
    public static void main(String[] args) {
        boolean hhe = isEven(0);
        System.out.println(hhe);


        int number = 4;
        int finishNumber = 50;
        int count = 0;
        while (number <= finishNumber)
        {
            number++;
            if(!isEven(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if(count == 5)
            {
                break;
            }


        }
        System.out.println("Total number of numbers found: " + count);
    }

    public static boolean isEven (int number)
    {
        if(number % 2 == 0)
            return true;
        else
        {
            return false;
        }
    }
}
