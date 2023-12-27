package variable;

import java.math.BigDecimal;

public class NumberMain {

    public static void main(String[] args) {
        /*
        변수: 값을 담는 공간.

        기본 자료형                 /                   참조 자료형
        int                                          String
        double                                       Object
        long                                         ...
        char                                         사용자 정의 클래스..
        ...

        Animal animal = new Animal(); // 주소를 담고 있음.
        animal.age
        animal.name
         */

        int a = 10; // 정수형
        int b = 7;

        System.out.println(a + b); // 17

        long longA = 10L; // int 보다 용량이 큼  int용량: 2,147,483,647 ~ -21억...

        float f = 0.31F;
        double d = 0.1; // double이 용량이 더 큼

        System.out.println(1.1 + 0.1 == 1.2); // 부동소수점 문제
        BigDecimal bigDecimal = new BigDecimal("123.12"); // 문자열로 계산

        bigDecimal = bigDecimal.add(new BigDecimal("100"));
        System.out.println(bigDecimal); // 223.12
    }

    static class Animal {
        private String name;
        private int age;
    }
}
