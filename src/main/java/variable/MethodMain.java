package variable;

public class MethodMain {

    public static void main(String[] args) {
        final Animal animal = new Animal(); // animal은 객체
        animal.speak();
    }

    static class Animal { // 클래스 : 객체를 찍어내는 틀 ==> 찍어낸 결과는 객체
        // 행위를 정의할 수 있음
        private String name;
        private int age;

        public void speak() { // 행위 정의 ==> 메소드
            System.out.println("동물소리");
        }
    }
}
