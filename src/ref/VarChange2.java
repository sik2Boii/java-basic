package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        /*
         * 하지만 참조형은 해당 객체 자체를 복사하는 것이 아닌 참조 주소(메모리에 할당된 주소) 값을 복사해서 대입하기 때문에,
         * 해당 값을 변동하면 참조 값이 같아서 같이 변함
         * 즉, 하나의 주소를 두 가지 이름으로 부를 수 있는 것과 비슷하다고 생각하면 됨
         * ex) 도로명 주소, 지번 주소 -> 이 둘은 표현 텍스트는 다르지만 실제로 같은 주소를 가르키는 것과 비슷
         */
    }

}
