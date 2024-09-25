package static2;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출 1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCallV2(data1);

        // 추가
        // 인스턴스를 통한 접근
        // 이것도 마찬가지로 인스턴스 메서드로 인식될 수 있어 권장하지 않음
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        // 여러번 접근이 필요한 경우 static import를 사용하면 클래스 이름을 생략하고 사용이 가능함
    }

}
