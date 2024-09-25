package poly.basic;

// 다운캐스팅을 자동으로 해주지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 실행 가능

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 오류 -> ClassCastException
        // 생성 자체가 Parent 객체로 생성됨, 즉 Child는 존재 하지 않음
        // 없는 타입을 호출하기 때문에 오류 발생

        child2.childMethod(); // 실행 불가

        // 정리
        // 자식 타입은 인스턴스를 생성할 때 모든 부모 타입을 생성한다
        // 그래서 업캐스팅을 해도 해당 인스턴스에 부모 인스턴스가 존재해서 해당 메서드나 변수를 읽어올 수 있음
        // 하지만 부모 인트턴스를 생성하면
        // 부모는 자신의 타입만 생성함, 즉 자식 타입의 인스턴스는 생성하지 않음
        // 그러나 명시적으로 다운 캐스팅을 해서 컴파일에서 오류는 안나지만
        // 실행 시 즉, 런타임 시에 자식 메서드를 호출하려고 하면 읽어올 인스턴스 자체가 존재하지 않기 때문에
        // 런타임 오류가 발생함
    }
}
