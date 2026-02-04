package lec11_encapsulation.access_modifier.different_package.test2;

import lec11_encapsulation.access_modifier.different_package.test1.AccessModifier1;

public class AccessModifier2 extends AccessModifier1 {
    public void display() {
        System.out.println(pro);
        System.out.println(pbl);
    }
}
