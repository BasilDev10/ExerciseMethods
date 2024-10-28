import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ExerciseOne();
        ExerciseTow();
        ExerciseThere();
    }
    public static void ExerciseOne(){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String userInput = "";

        do{
            System.out.println("Enter number or type out to exit :");
            userInput = input.nextLine();
            if(userInput.equals("out"))break;

            numbers.add(Integer.parseInt(userInput));
        }while (true);

        System.out.println("Smallest number is :"+getSmallestNumber(numbers));


    }
    public static int getSmallestNumber(ArrayList<Integer> numbers){

        int smallestNum = 999999999;

        for (int item : numbers){
            if(item < smallestNum){
                smallestNum = item;
            }
        }
        return smallestNum;
    }

    public static void ExerciseTow(){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String userInput = "";

        do{
            System.out.println("Enter number or type out to exit :");
            userInput = input.nextLine();
            if(userInput.equals("out"))break;

            numbers.add(Integer.parseInt(userInput));
        }while (true);
        for (int item:numbers){
            System.out.println("Number "+item+" is "+checkNumber(item));
        }
    }
    public static String checkNumber(int number){
        if(number == 0){
            return "Zero";
        }else if(number > 0){
            return "Positive";
        }else{
            return "Negative";
        }
    }
    public static void ExerciseThere(){

        Scanner input = new Scanner(System.in);

        String password = "";
        boolean isValid = false;

        do {
            System.out.println("1. A password must have at least eight characters.\n2. A password consists of only letters and digits.\n3. A password must contain at least tow digits.\nEnter password :");
            password = input.nextLine();
            if(!isEightCharacters(password))continue;
            if(isLatterAndDigits(password))continue;
            if(!isAtLeastTowDigits(password))continue;

            break;



        }while (true);

        System.out.println("Password is valid : "+password);
    }
    public static boolean isEightCharacters(String password){
        return password.length() >=8;
    }
    public static boolean isLatterAndDigits(String password){

      Pattern pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);

      Matcher matcher = pattern.matcher(password);
      return matcher.find();
    }

    public static boolean isAtLeastTowDigits(String password){
        int countDigits = 0;
        for (int i= 0;i < password.length();i++){
            if(Character.isDigit(password.charAt(i))){
                countDigits ++;
            }
        }
        return countDigits >= 2;
    }
}