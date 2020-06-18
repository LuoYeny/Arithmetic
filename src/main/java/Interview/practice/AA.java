package Interview.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AA {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<List<String>> list = new LinkedList<List<String>>();
        int count =Integer.parseInt(sc.nextLine());

        for (int i = 0; i <count ; i++) {
            List<String> tempList = new LinkedList<String>();
            int fix = Integer.parseInt(sc.nextLine());

            for (int j = 0; j <fix ; j++) {
                String str = sc.nextLine ();
                tempList.add(str);
            }

            list.add(tempList);
        }




    }
}
