import java.util.Scanner;

public class WhereFrom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int whereFrom, whereTo;

        System.out.println("Where to?: ");
        whereTo = scan.nextInt();
        System.out.println("Where from?: ");
        whereFrom = scan.nextInt();

        for(int i = whereFrom; i <= whereTo; i++){
            if(whereTo < whereFrom) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}
