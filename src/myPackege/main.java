package myPackege;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static  void main(String[] args) {

        makePassword good = new makePassword();
        int b,k;
        int a = b =k = 0;
        while(true){
            Scanner str = new Scanner (System.in);
            try{
                System.out.print("Введите количество символов в пароле:");
                a = str.nextInt();
                System.out.print("Сколько цивор должно быть в пароле:");
                b = str.nextInt();
                System.out.print("Введите количество паролей:");
                k = str.nextInt();
                for(int i=0; i<k; i++)
                    System.out.println(good.Password(a,b));
                break;
            } catch (InputMismatchException e){
                System.out.println("Вы ввели не число");
            }
        }


    }


}

