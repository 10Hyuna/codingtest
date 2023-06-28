import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int price;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        list.add(third);

        //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

        if(first == second && second == third){
            price = 10000 + first * 1000;
        }
        else if(first == second || first == third){
            price = 1000 + first * 100;
        }
        else if(second == third){
            price = 1000 + second * 100;
        }
        else{
            int max = Collections.max(list);
            price = max * 100;
        }

        System.out.println(price);
    }
}