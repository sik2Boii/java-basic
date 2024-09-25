package poly.ex4;

/**
 * 순수 추상클래스
 * 모든 메서드가 추상 메서드인 추상 클래스
 * 단지 다형성을 위한 부모 타입으로써 껍데기 역할만 함
 */
public abstract class AbstractAnimal {

    public abstract void sound();
    public abstract void move();

}
