package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
//        super(); // 기본 생성자의 경우 생략 가능하지만,
        super(10, 20); // 생성자가 정의된 경우 개발자가 직접 생성해야함, 여러 개가 정의된 경어 어떤 생성자를 사용할지 모르기 때문
        System.out.println("ClassC 생성자");
    }

}
