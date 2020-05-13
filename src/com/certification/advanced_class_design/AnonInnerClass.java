package com.certification.advanced_class_design;
/* Anon Inner class is the same whether you implement an interface or extend a class
*
* */
public class AnonInnerClass {
    abstract class SaleTodayOnly{
        abstract int dollarsOff();
    }

    public int admission(int basePrice){
        SaleTodayOnly saleTodayOnly = new SaleTodayOnly(){
            int dollarsOff(){
                return 3;
            }
        };

        return  basePrice - saleTodayOnly.dollarsOff();
    }
}
