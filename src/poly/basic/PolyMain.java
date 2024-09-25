package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        // 부모는 자식을 담을 수 있음
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 자식을 부모에 대입
        // 인스턴스 생성은 자식타입으로 하지만 저장은 부모 타입에 하는 것
        poly.parentMethod();
//        poly.childMethod(); // 단, 자식의 기능은 호출할 수 없음

        // 자식은 부모를 담을 수 없음
//        Child child1 = new Parent(); // Parent cannot be converted to poly.basic.Child

        // 다형적 참조: 부모는 자식뿐만 아니라 손자 그 아래 자식 계속 참조 가능
    }

}
