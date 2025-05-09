package com.thetestingacademy.ex_02_RA_Concepts;

public class APITesting_Lab_04_BP {
    //BP- Builder Pattern- Using class name
    public APITesting_Lab_04_BP step1()
    {
        System.out.println("Step 1");
        return this;
    }
    public APITesting_Lab_04_BP step2()
    {
        System.out.println("Step 2");
        return this;
    }
    public APITesting_Lab_04_BP step3(String param)
    {
        System.out.println("Step 3 "+param);
        return this;
    }

    public static void main(String[] args) {
        APITesting_Lab_04_BP bp=new APITesting_Lab_04_BP();
        bp.step1().step2().step3("Rajakumari");
        //This is called builder pattern
    }
}
