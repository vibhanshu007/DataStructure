package Challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxPowerGirl {

    public static void main(String args[]) throws Exception {

        //Write code here
        try {
            System.out.println(maxGirls());
        } catch (Exception e) {
            System.out.println(maxGirls());
        }


    }

    private static int maxGirls() {
        ArrayList<Integer> requiredArr = new ArrayList<>();
        ArrayList<Integer> presentArr = new ArrayList<>();
        ArrayList<Integer> resultArr = new ArrayList<>();
        Scanner ingSc = new Scanner(System.in);

        //System.out.print("Number of ingredients required : ");

        try {

            int ingredients = ingSc.nextInt();

            for (int i = 0; i <= ingredients - 1; i++) {
                //System.out.print("Please enter required quantity of "+ i +"st Ingredients : ");
                int required = ingSc.nextInt();
                requiredArr.add(required);
            }

            for (int i = 0; i <= ingredients - 1; i++) {
                //System.out.print("Please enter present quantity of "+ i +"st Ingredients : ");
                int present = ingSc.nextInt();
                presentArr.add(present);
            }

            for (int i = 0; i <= ingredients - 1; i++) {
                //System.out.print("Please enter present quantity of "+ i +"st Ingredients : ");
                //int present = ingSc.nextInt();
                int maxGirls = presentArr.get(i) / requiredArr.get(i);
                resultArr.add(maxGirls);
            }

            Collections.sort(resultArr);

            return resultArr.get(0);

        } catch (Exception e) {

            return 0;
        }
    }


}
