package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        // new Student(); 로 객체를 생성하면 메모리 어디에 생성되어 있는지 모르기 때문에 참조 값을 보관함
        // student1 = x001 -> 인스턴스 참조 값(메모리 주소)을 보관

        // x001의 객체의 해당 값에 저장
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }

}
