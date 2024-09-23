package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    /**
     * 생성자를 정의하면 컴파일 시 오류가 발생해 값이 필수 정보가 누락되는 오류를 막을 수 있음
     * 필수 정보들은 생성자를 통해 무조건 입력되도록 하고,
     * 선택 정보는 나중에 저장하는 식으로 사용이 가능하다.
     */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 생성자 오버로딩
    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        // this()를 사용해 생성자 내부에서 다른 생성자를 호출할 수 있음
        // this()는 생성자 코드의 첫 줄에만 사용이 가능함
        this(name, age, 50);
    }
}
