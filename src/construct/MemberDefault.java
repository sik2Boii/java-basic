package construct;

public class MemberDefault {
    String name;

    /**
     * 생성자가 없으면 자바가 기본 생성자를 제공(아무 기능이 없음)
     * 기본 생성자의 형태
     *  public MemberDefault() {
     *  }
     *  ----------
     * 생성자가 하나로도 있으면 기본 생성자는 제공되지 않음
     * 이 경우에는 정의한 생성자를 직접 호출해야만 함
     */
    MemberDefault() {
        System.out.println("생성자 호출");
    }
}
