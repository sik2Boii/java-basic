package poly.ex3;

// abstract를 사용하면 인스턴스를 생성할 수 없음
public abstract class AbstractAnimal {

    // 추상 메서드가 존재하면 클래스도 반드시 추상 클래스로 선언해야함
    // 메서드 바디가 없음, 즉 실체가 없는 메서드를 가진 불완전한 클래스로 봄
    // 따라서 직접 생성하지 못하도록 클래스를 추상 클래스로 선언
    // 추상 메서드를 상속받은 클래스에서 오버라이딩하면 컴파일 에러 발생함
    // 실체를 자식이 정의해야하는데 거기서도 정의되지 않았기 때문
    public abstract void sound();
    // {} Abstract methods cannot have a body -> 바디를 가지려고 하면 컴파일 에러 남

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

}
