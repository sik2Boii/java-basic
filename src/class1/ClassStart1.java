package class1;

public class ClassStart1 {

    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        // 학생이 늘어날 때 마다 변수를 추가로 선언
        String student3Name = "학생3";
        int student3Age = 17;
        int student3Grade = 80;

        System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 성적:" + student1Grade);
        System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 성적:" + student2Grade);
        // 출력하는 코드도 추가
        System.out.println("이름:" + student3Name + " 나이:" + student3Age + " 성적:" + student3Grade);
    }

}
