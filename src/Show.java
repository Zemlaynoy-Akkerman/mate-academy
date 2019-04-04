import service.Utils;

public class Show {

    public static void Hello(){
        System.out.println("Welcome to Calculator");

    }

    public static void showString(String string){
        System.out.println(string);
    }

    public static void result(int result, int methot){
        if(methot == 2){
            System.out.println("------------------------\nResult = " + result);
        } else {
            System.out.println("------------------------\n" +
                    "Result = " + Utils.convertIntegerToRoman(result));
        }

    }

    public static void selectionFunction() {
        System.out.println("Enter:\n'+'\t'/'\n'-'\t'*'\nEnter 'exit'");
    }

    public static void enterMethot() {
        System.out.println("Enter: 1 ---> Arabic\nEnter: 2 ---> Roman");
    }
}
