package poly.diamond;

/**
 * 인테페이스는 다중 상속을 지원함
 * 기존 클래스에서 다중 상속을 지원하지 않는 이유는 다이아몬드 문제 때문임
 * 다이아몬드 문제란 같은 메서드 이름이 존재 할 때,
 * 어떤 부모 클래스의 메서드를 호출할지 모호해지는 문제를 뜻함
 * 하지만, 인터페이스는 메서드 구현이 없기 때문에 다중 상속을 지원해도 다이아몬드 문제가 발생하지 않음
 * 만약, 같은 이름의 추상 메서드가 정의되어도 어떤 한 부모의 추상 메서드를 선택하는 것이 아니라
 * 그냥 인터페이스들을 구현한 메서드를 호출해서 사용되므로 다이아몬드 문제는 발생하지 않음
 */
public class Child implements InterfaceA, InterfaceB {

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    /**
     * 양쪽 인터페이스에 다 있지만 같은 메서드이므로 구현은 하나만 하면 됨
     */
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }

}
