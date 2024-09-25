package final1;

public class ConstantMain1 {

    public static void main(String[] args) {

        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수:" + currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참가합니다.");
        }
    }

    // 유지 보수 할 때, 최대 참여자 수를 변경하면 해당 부분을 모두 수정해야함
    // 만약 담당자가 변경이 되었다면 해당 1,000이 의미하는 숫자가 무엇인지 계속 생각해야함
    // 이런 문제들은 static fanal을 사용하면 쉽게 해결이 가능함

}
