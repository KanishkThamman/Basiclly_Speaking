public class Basiclly_Speaking
{
    public static void main(String args[])
    {
        System.out.println("Decimal \tBinary\t\tOctal\t\tHex\t\tCharector");


        for(int num = 65; num < 91; num++)
        {
            System.out.println(num + "\t\t"+toBinaryString(num)+"\t\t"+toOctalString(num)+"\t\t"+toHexString(num)+"\t\t"+ (char) num);
        }

    }


    public static String toBinaryString(int number)
    {
        String num1 = "";
        int r;
        while(number != 0)
        {
            r = number%2;
            number = number/2;
            num1 = r+num1;
        }
        return num1;
    }

    public static String toOctalString(int number)
    {
        String num1 = "";
        int r;
        while(number != 0)
        {
            r=number%8;
            number = number / 8;
            num1 = r+num1;
        }
        return num1;
    }
    public static String toHexString(int number)
    {
        String num1 = "";
        int r;
        while (number != 0)
        {
            r = number%16;
            number = number/16;

            switch (r)
            {
                case 10:
                    num1= "A"+num1;
                    break;
                case 11:
                    num1= "B"+num1;
                    break;
                case 12:
                    num1= "C"+num1;
                    break;
                case 13:
                    num1= "D"+num1;
                    break;
                case 14:
                    num1= "E"+num1;
                    break;
                case 15:
                    num1= "F"+num1;
                    break;
                    default:
                        num1 = r+num1;
            }
        }
        return num1;
    }

}