package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent ploy = new Child(); // x001
        // 단 자식의 기능은 호출 X, 컴파일 에서
//        ploy.childMethod();

        // 다운 캐스팅(부모 -> 자식)
        Child child = (Child) ploy; // x001
        child.childMethod();
    }
}