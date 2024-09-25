package static2;

public class DecoUtil2 {

    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;

        // static이 붙은 메서드는 DecoUtil1처럼 의미 없는 객체 생성 없이 클래스에서 바로 접근가능하게 해줌
    }

}
