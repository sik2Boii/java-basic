package static1;

public class DataCounterMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count: " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count: " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count: " + counter.count);
        // DataCounterMain1의 문제를 해결하기 위해서 공통으로 사용하는 Counter을 외부에 만듬
        // 이번에는 내 바람대로 3이 나옴, 왜냐면 객체를 만들 때마다 외부 카운터 객체의 값을 증가 시켰기 때문
        // 하지만 외부에서 따로 관리할 객체가 늘었으니 효율적인 거 같지는 않음
    }

}
