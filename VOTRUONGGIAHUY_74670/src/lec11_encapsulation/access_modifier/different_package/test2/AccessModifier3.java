package lec11_encapsulation.access_modifier.different_package.test2;

import lec11_encapsulation.access_modifier.different_package.test1.AccessModifier1;

public class AccessModifier3 {
    public void display() {
        AccessModifier1 obj = new AccessModifier1();
        System.out.println(obj.pbl);
    }
}
