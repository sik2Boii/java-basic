package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        // 같은 패키지 내의 클래스는 패키지  경로 생략 가능
        Data data = new Data();
        // 다른 패키지의 클래스를 사용하는 경우 패키지 전체 경로를 명시해야함
        pack.a.User user = new pack.a.User();
    }

}
