package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 클래스도 역시 배열로 관리할 수 있음
        Student[] students = new Student[2]; // 참조 값이 없기 때문에 null로 초기화 됨
        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사함
        // 즉, 객체를 넣는 것이 아니라 참조 값을 넣음
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }

}
