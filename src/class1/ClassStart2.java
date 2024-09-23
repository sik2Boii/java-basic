package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        // 배열을 사용하면 학생 데이터만 추가하면 ClassStart1 처럼 변수를 계속 선언하지 않아도 됨
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        // 반복문을 사용해서 데이터가 추가되어도 출력문을 수정할 필요가 없음
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" +
                    studentAges[i] + " 성적:" + studentGrades[i]);
        }

        /* 클래스가 필요한 이유 !!!
         * 배열을 사용해서 관리해도 코드를 간결하게 유지할 수 있지만,
         * 데이터가 여러 배열에 분산되어 저장되기 때문에 데이터 수정 시
         * 해당 데이터에 해당하는 정확한 인덱스에 접근이 필요함
         * 잘못된 인덱스에 접근 시 관련 없는 데이터가 수정되므로 주의해야 함
         */
    }

}
