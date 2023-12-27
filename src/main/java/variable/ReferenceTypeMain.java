package variable;

public class ReferenceTypeMain {

    public static void main(String[] args) {
        final Animal animal = new Animal(); // new(메모리 할당 연산자):  메모리에 animal이 들어갈 공간을 할당하고 주소를 반환
        animal.name = "피카츄";
        animal.age = 5;

        System.out.println("이름: " + animal.name + ", 나이:" + animal.age);

        String s = "테킷 백엔드"; // string pool
    }

    static class Animal {
        private String name;
        private int age;
    }
}
