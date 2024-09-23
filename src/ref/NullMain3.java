package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.data: " + bigData.data);
        System.out.println("bigData.count: " + bigData.count);

        // NullPointerException
        // bigData는 생성되어 참조값이 있음
        // bigData.data는 참조값이 없음(null)
        // 즉, null을 참조하기 때문에 NullPointerException 에러가 남
        System.out.println("bigData.data.value: " + bigData.data.value);
    }

}
