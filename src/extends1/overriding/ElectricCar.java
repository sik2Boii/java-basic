package extends1.overriding;

public class ElectricCar extends Car {

    /**
     * 오버라이드 애노테이션은 필수는 아니지만,
     * 붙이면 컴파일 단계에서 에러를 검출하기 때문에 붙이는 것이 좋다.
     * 부모 타입의 메서드를 자식이 다시 정의할 때 오버라이딩함
     */
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
