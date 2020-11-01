package com.company.oop.AccessModifier.Package01;


public class AccessOne {
    public static String publicVariable;
    protected static String protectedVariable;
    private static String privateVariable;
    static String defaultVariable;


    void infoAccessOne(){
        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);
    }

}
