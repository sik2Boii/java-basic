package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 인스턴스가 생성되어야 접근이 가능한데 애초에 상식적으로 접근이 불가능
        // 인스턴스가 만들어졌다고 해도 어떤 참고 값을 참조해야하는 지 알 수 없음
//        instanceValue++; // 인스턴스 변수 접근
//        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++;
        staticMethod();
    }

    // 그러나 static 메서드에 인스턴스를 매개변수로 전달하면,
    // 참조 값이 생겨서 인스턴스 변수와 메서드에 접근이 가능해짐
    public static void staticCallV2(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue: " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue: " + staticValue);
    }

}
