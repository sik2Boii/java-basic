package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 util1 = new DecoUtil1();
        String deco = util1.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);

        // 클래스에서 관리되는 변수들 없어서 객체를 생성하는 의미가 없음
        // 1개를 생성해서 사용하든 10개를 만들든 의미가 없음
    }

}
