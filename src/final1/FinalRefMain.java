package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data(); // 컴파일 에러

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println("data.value: " + data.value);
        data.value = 20;
        System.out.println("data.value: " + data.value);
        // data.value의 값이 final이 아니기 때문에 변경이 가능함
        // data는 final이기 때문에 변경이 불가능함
    }

}
