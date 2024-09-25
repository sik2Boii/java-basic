package static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A data: " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B data: " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C data: " + data3.count);
        // 3개의 객체가 생성되어 3을 기대했지만, 결과는 계속 1임
        // 해당 객체를 만들고 카운트를 0에서 1로 증가 시키므로 정상 작동 과정이 맞음
        // 왜 기대와 다른가?
        // 객체마다 독립적인 카운트 변수를 사용하기 때문
        // 해당 객체 내부에서 실행되기 때문
    }

}
