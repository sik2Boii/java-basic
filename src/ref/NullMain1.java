package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data: " + data);
        data = new Data();
        System.out.println("2. data: " + data);
        // 해당 값을 null로 변경하면 해당 참조 값은 메모리에 할당되어 있지만,
        // 사용할 수 있는 방법이 없다. java는 GC가 자동으로 사용하지 않는 인스턴스는 제거해줌
        // 직접 할당 해제 하는 게 더 좋고 빠르지 않나요?
        // 최적화가 너무 잘되어 있어서 그냥 사용하면 됨
        data = null;
        System.out.println("3. data: " + data);
    }

}
