package variable;

public class ControlMain {

    public static void main(String[] args) {
        // 조건문
        // if ~ else if ~ else
        int a = 4;
        if (a == 1) { // true or false ==> boolean 타입
            System.out.println("if 조건이 참");
        } else if(a == 2) { // true or false ==> boolean 타입
            System.out.println("if 조건은 거짓이고 else if 조건이 참");
        } else if(a == 3) { // true or false ==> boolean 타입
            System.out.println("if 조건은 거짓이고 else if 조건이 참");
        } else {
            System.out.println("if 조건은 거짓이고 else if 조건도 거짓");
        }

        if (a == 4) System.out.println("코드블럭 생략 가능");
        // switch case
        switch (a) {
            case 1:
                System.out.println("a는1");
                break;
            case 2:
                System.out.println("a는2");
                break;
            case 4:
                System.out.println("a는4");
                break;
            default:
                System.out.println("a는 몇이지...");
        }

        // 반복문
        // while
        int n = 0;
        while (n < 10) { // ()안에 조건문이 옴
            System.out.println("n = " + n);
            n++; // n 에 1을 더해라
        }
        System.out.println("while 끝 n = " + n);

        // for
        for (int i = 0; i < 10; i++) { // 사용할 변수선언; 조건문; 증감식;
            System.out.println("i = " + i);
        }
        System.out.println("for문 끝");

        // for each
        int[] arr = new int[] {1, 2, 3, 4, 5}; // 배열 또는 컬렉션
        for (int i : arr) { // Iterable을 구현하고 있는 객체 대상
            System.out.println(i);
        }

        // break
        int m = 0;
        while (true) { // 무한루프
            if (m == 10) {
                break; // 가장 가까운 루프를 종료
            }
            System.out.println("m = " + m);
            m++;
        }

        for (int i = 0; i < 1000; i++) { // 사용할 변수선언; 조건문; 증감식;
            if (i == 10) {
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("for문 끝");

        // continue
        int k = 0;
        while (k < 10) {
            k++;
            if (k % 2 == 0) { // 짝수
                continue; // 반복문 안에 뒤에 있는 코드 무시, 다음 회차로 진행
            }
            System.out.println("k = " + k);
        }
    }
}
