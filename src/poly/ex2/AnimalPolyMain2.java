package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
        // 이렇게 작성하면 코드의 중복도 줄고, 유지보수가 용이해진다.
        // 하지만 Animal도 클래스이므로 생성되어서 사용될 가능성이 있음
        // Animal클래스는 추상화를 위한 클래스이지 실제로 사용하기려고 만든 클래스는 아님
        // 이런 문제점을 해결하기 위해서 추상 클래스를 활용하는 것
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
