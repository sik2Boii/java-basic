package pack;

// import pack.a.*; // 패키지 내의 모든 클래스 import
import pack.a.User;
import pack.a.User2;

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        // import를 사용해서 경로 생략이 가능해짐
        User user = new User();
        User2 user2 = new User2();
    }

}
