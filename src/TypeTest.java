public class TypeTest {
    public static void main(String[] args){
        //System.out.println("int 최대 " + Integer.MAX_VALUE);
        //System.out.println("int 최소 "  + Integer.MIN_VALUE);
        //System.out.println("Long 최대 " + Long.MAX_VALUE);
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(max + 1); // max에서 1비트 값이 올라가면서 음수로 바뀌는건가?
        double d = 3.9;
        System.out.println((int) d);
        System.out.println(Math.round(d));

        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += 0.1;
        }
        System.out.println(sum);          // 1.0 인가?
        System.out.println(sum == 1.0);


        String name = "박장현";
        int age = 30;
        double height = 180.9;
        boolean isAdult = (age >= 20);
        String Strnumber = "2101097";
        System.out.println("내 이름은 " + name + " 나이는 " + age + " 키 는 " + height);
        System.out.println("성인 여부는 " + isAdult + " 학번은 " + Strnumber);
        //이름은 참조 자료형 String , 나이는 int 사용 이유는 java 정수 타입
        //키는 소수점이라 double float 사용 안한 이유는 정밀도가 낮음
        //성인 여부는 boolean 참 거짓만 여부 확인 학번은 String 이유는 int로 연산 할 이유 없음
    }
}
