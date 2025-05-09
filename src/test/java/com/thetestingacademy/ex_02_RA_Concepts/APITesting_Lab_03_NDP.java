package com.thetestingacademy.ex_02_RA_Concepts;

public class APITesting_Lab_03_NDP {

    public void step1() {
        System.out.println("Step 1");
    }

    public void step2() {
        System.out.println("Step 2");
    }

    public void step3(String param1) {
        System.out.println("Step 3 "+param1);
    }

    public static void main(String[] args) {
        APITesting_Lab_03_NDP ndp = new APITesting_Lab_03_NDP();
        ndp.step1();
        ndp.step2();
        ndp.step3("Rajakumari");
    }


}
//ndp- No Logic Pattern