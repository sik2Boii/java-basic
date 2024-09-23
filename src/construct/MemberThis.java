package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // 아래 코드와 주석된 부분은 같은 의미이다.
        // 먼저 지역변수에서 같은 이름이 있는 지 찾고,
        // 존재 하지 않으면 맴버 변수에서 찾아줌
        // this.를 생략해도 맴버 변수로 인식됨
        nameField = nameParameter;
        // this.nameField = nameParameter;

        // 과거에는 this. 를 무조건 붙여서 맴버 변수임을 찾기 쉽게 하는 관습이 있었지만,
        // 현재 IDE의 발전으로 가독성이 좋아져 요즘은 생략함
    }

}
