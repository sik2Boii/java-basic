package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        // 같은 이름의 클래스가 있다면,
        // 여러 개 중에 하나만 import 가능함
        // 자주 사용하는 클래스를 import 하고,
        // 나머지는 경로를 작성하는 것을 권장함
        User userA  = new User();
        pack.b.User userB = new pack.b.User();
    }

}
