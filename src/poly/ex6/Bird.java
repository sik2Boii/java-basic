package poly.ex6;

// 상속은 하나만, 인터페이스는 다중 구현
// 둘이 함께 나오면 extends 먼저 명시
public class Bird extends AbstractAnimal implements Fly {

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }

}
