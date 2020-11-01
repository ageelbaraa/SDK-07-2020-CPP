package com.company.oop.AccessModifier.Package02;

import com.company.oop.AccessModifier.Package01.AccessOne;

public class AccessFour extends AccessOne {

    void infoAccessFour(){
        System.out.println(publicVariable);
        System.out.println(protectedVariable);
    }
}
