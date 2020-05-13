package com.certification.advanced_class_design;

/* Java uses == to compare primitives and to compare if two variables refer to the same object
   Checking if two objects are equivalent uses the equals() method
*
*
* */
public class Equals {

    public static void main(String[] args) {
//        check();
        check2();
    }

    static void check() {
        String s1 = new String("lion");
        String s2 = new String("lion");
        System.out.println(s1.equals(s2)); //true
        StringBuilder sb1 = new StringBuilder("lion");
        StringBuilder sb2 = new StringBuilder("lion");
        System.out.println(sb1.equals(sb2)); //false
    }

    static void check2() {
        Lion lion1 = new Lion(1L);
        Lion lion2 = new Lion(1L);

        System.out.println(lion1 == lion2); //false
        System.out.println(lion1.equals(lion2)); //true
    }

}

class Lion {
    private Long id;

    public Lion(Long id){
        this.id = id;
    }

    public boolean equals(Object o){
        if(!(o instanceof Lion)){
            return false;
        }

        return this.id.equals(((Lion) o).id);
    }
}
