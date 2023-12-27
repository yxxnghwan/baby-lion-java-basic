package variable;

public class Sonata implements Car {

    @Override
    public void drive() {
        System.out.println("소나타 달린다.");
    }

    @Override
    public void ride() {
        System.out.println("소나타 탑승");
    }

    public void goToHyundaiCenter() {
        System.out.println("현대 정비소 들르기");
    }
}
