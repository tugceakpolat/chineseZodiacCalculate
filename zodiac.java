import java.util.Scanner;
public class zodiac {
    public static void main(String[] args) {

        int sign;
        int birthYear;
        String zodiac = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your year of birth : ");
        birthYear = input.nextInt();

        if( birthYear < 0 ){
            System.out.println("Invalid year of birth.");
            return;
        }

        sign = birthYear % 12;

        if (sign == 0){
            zodiac = "Monkey.";
        }else if (sign == 1){
            zodiac = "Cockerel.";
        }else if ( sign == 2){
            zodiac = "Dog.";
        }else if (sign == 3){
            zodiac = "Pig.";
        }else if ( sign == 4){
            zodiac = "Mouse.";
        }else if (sign ==5){
            zodiac = "Ox.";
        }else if ( sign == 6){
            zodiac = "Tiger.";
        }else if ( sign == 7){
            zodiac = "Rabbit.";
        }else if ( sign == 8){
            zodiac = "Dragon.";
        }else if (sign == 9){
            zodiac = "Snake.";
        }else if (sign == 10){
            zodiac ="Horse.";
        }else if (sign == 11){
            zodiac = "Sheep.";
        }
        System.out.println("Your Chinese Zodiac Sign : " + zodiac);

        /*
        *switch case kullanarak ise şu şekilde yazılır;
        int sign;
        int birthyear;
        String zodiac = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your year of birth : ");
        birthYear = input.nextInt();

        if( birthYear < 0 ){
            System.out.println("Invalid year of birth.");
            return;
        }

        switch (sign){
        case 0:
        zodiac = "Monkey.";
        break;

        case 1:
        zodiac = "Cockerel.";
        break;

        case 2:
        zodiac = "Dog.";
        break;

        case 3:
        zodiac = "Pig.";
        break;

        case 4:
        zodiac ="Mouse.";
        break;

        case 5:
        zodiac ="Ox.";
        break;

        case 6 :
        zodiac ="Tiger.";
        break;

        case 7 :
        zodiac ="Rabbit.";
        break;

        case 8:
        zodiac ="Dragon.";
        break;

        case 9:
        zodiac = "Snake.";
        break;

        case 10:
        zodiac ="Horse.";
        break;

        case 11:
        zodiac =
        break;"Sheep.";
        }

        System.out.println("Your Chinese Zodiac Sign : " + zodiac);

         */
        }


    }

