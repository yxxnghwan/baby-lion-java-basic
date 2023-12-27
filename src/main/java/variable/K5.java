package variable;

public class K5 implements Car {

    @Override
    public void drive() {
        System.out.println("K5 달린다.");
    }

    @Override
    public void ride() {
        System.out.println("k5 탑승");
    }

    public void goToKiaCenter() {
        System.out.println("기아 정비소 들르기");
    }
}
