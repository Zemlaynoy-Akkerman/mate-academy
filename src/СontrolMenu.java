import service.Service;
import service.Utils;

public class СontrolMenu {

    public static void menu(){
        ReadCommandLine readCommandLine = new ReadCommandLine();
        Calculator calculator = new Calculator();
        Service service = new Service();
        Show.Hello();
        boolean ret = false;
        int methot = 1;
        do {
            ret = false;
            Show.enterMethot();
            methot = Integer.valueOf(readCommandLine.keyboardInput());
            if(methot == 2){
                Show.showString("Enter first number");
                calculator.setFirst(Integer.valueOf(readCommandLine.keyboardInput()));
                Show.showString("Enter second number");
                calculator.setSecond(Integer.valueOf(readCommandLine.keyboardInput()));
            } else if(methot == 1){
                Show.showString("Enter first number");
                calculator.setFirst(Utils.convertRomanToInt(readCommandLine.keyboardInput()));
                Show.showString("Enter second number");
                calculator.setSecond(Utils.convertRomanToInt(readCommandLine.keyboardInput()));
            }
            Show.selectionFunction();
            switch(readCommandLine.keyboardInput()){
                case "+":
                    Show.result(service.sum(calculator.getFirst(),calculator.getSecond()),methot);
                    break;
                case "/":
                    Show.result(service.division(calculator.getFirst(),calculator.getSecond()),methot);
                    break;
                case "-":
                    Show.result(service.minus(calculator.getFirst(),calculator.getSecond()),methot);
                    break;
                case "*":
                    Show.result(service.multiply(calculator.getFirst(),calculator.getSecond()),methot);
                    break;
                case "exit":
                    System.out.println("Exit!!!");
                    return;
                default:
                    System.out.println("Error.... Rebut...");
                    break;
            }

            if(!ret){
                Show.showString("------------------------------------\n" +
                        "Continue? Enter: 1\nEnter: 2 Exit");
                int reset = Integer.valueOf(readCommandLine.keyboardInput());
                if(reset == 1){
                    ret = true;
                }
            }
        } while (ret);
    }
}
