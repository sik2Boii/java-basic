
package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent ploy = new Child(); // x001
        // 단 자식의 기능은 호출 X, 컴파일 에서
//        ploy.childMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) ploy).childMethod();
    }

}