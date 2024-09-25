package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count: " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count: " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count: " + Data3.count);

        // static 키워드르 변수에 사용하면, 공통 변수를 사용해서 쉽게 관리할 수 있음
        // DataCountMain2 처럼 외부에서 따로 관리하지 않아도 됨
        // static 변수는 힙 영역(객체를 관리하는 영역)이 아닌 메서드 영역에서 관리하게 됨

        // 인스턴스를 통한 접근도 가능하긴 함
        // 권장하는 방법은 아님
        // 왜냐하면 인스턴스 변수로 인식될 수 있기 때문에 가독성, 협업면에서 추천하지 않음
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 비권장: 인스턴스를 통해 접근
        System.out.println(Data3.count); // 권장: 클래스명을 통해 접근
    }

}
