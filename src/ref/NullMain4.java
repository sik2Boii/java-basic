package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        // NullMain3에서 해결한 문제를 해결하기 위해 bigData.data를 초기화 해줌
        bigData.data = new Data();
        System.out.println("bigData.data: " + bigData.data);
        System.out.println("bigData.count: " + bigData.count);

        System.out.println("bigData.data.value: " + bigData.data.value);
    }

}
