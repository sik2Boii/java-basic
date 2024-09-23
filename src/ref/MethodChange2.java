package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changePrimitive(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }

    // 매개변수(파라미터)로 참조형 데이터가 전달되면,
    // 참조 값이 복사되어 해당 메서드에 전달됨
    // 메서드 내부에서 해당 매개변수(파라미터)를 변경하면
    // 참조 값이 똑같기 때문에 기존 객체의 값도 함께 변경됨
    static void changePrimitive(Data dataX) {
        dataX.value = 20;
    }
}
