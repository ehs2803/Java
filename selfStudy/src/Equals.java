class Person{
    long id;

    public boolean equals(Object obj){
        if(obj instanceof Person){
            return id == ((Person)obj).id;
        }
        else{
            return false;
        }
    }
    Person(long id){
        this.id = id;
    }
}


public class Equals {
    static class Test1{
        int x;
        String y;
        public Test1(int x, String y){
            this.x=x;
            this.y=y;
        }
        public void setX(int x){this.x=x;}
        public void setY(String y){this.y=y;}
    }

    static class Test2{
        int x;
        String y;
        public Test2(int x, String y){
            this.x=x;
            this.y=y;
        }
        public void setX(int x){this.x=x;}
        public void setY(String y){this.y=y;}
        @Override
        public boolean equals(Object obj){
            if(obj instanceof Test2){
                Test2 test2 = (Test2) obj;
                if(x==test2.x && y.equals(test2.y)){
                    return true;
                } else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
    }

    public static <Stirng> void main(String[] args) {
        //primitive type
        int a = 10;
        int b = 10;
        int c = 20;

        System.out.println("primitive type===============");
        System.out.println(a==b);    //true
        System.out.println(a==c);    //false

        //reference type - String
        String text1 = "sample";
        String text2 = text1;
        String A = "Java"; // 리터럴(literal)       		주소값 : 1000 (예시 - 실제주소는 다름)
        String B = "Java"; // 리터럴(literal)			주소값 : 1000
        String C = new String("Java"); // new 연산자	주소값 : 2000
        String D = new String("Java"); // new 연산자	주소값 : 3000

        System.out.println("reference type - String===============");
        System.out.println(text1==text2);            //true
        System.out.println(text1.equals(text2));    //true
        System.out.println(A==B);            //false
        System.out.println(A.equals(B));    //true
        System.out.println(C==D);    //true
        System.out.println(C.equals(D));    //true
        System.out.println(A==C);    //true
        System.out.println(A.equals(C));    //true

        //reference type - Integer
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf(10);

        System.out.println("reference type - Integer===============");
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println(i3 == i4);

        //reference type - Class
        Test1 test1_1 = new Test1(1,"1");
        Test1 test1_2 = new Test1(1,"1");

        Test2 test2_1 = new Test2(1,"1");
        Test2 test2_2 = new Test2(1,"1");

        Person p1 = new Person(21710736L);
        Person p2 = new Person(21710736L);

        System.out.println("reference type - class===============");
        System.out.println(test1_1==test1_2);
        System.out.println(test1_1.equals(test1_2));

        System.out.println(test2_1==test2_2);
        System.out.println(test2_1.equals(test2_2));


        if(p1 == p2){
            System.out.println("true");
        }
        else{
            System.out.println("fasle");
        }
        if(p1.equals(p2)){
            System.out.println("true");
        }
        else{
            System.out.println("fasle");
        }
    }
}
/*
단순하게 말하면 == 연산자는 int,boolean과 같은 primitive type에 대해서는 값을 비교한다. reference type에 대해서는 주소값을 비교한다.

사실 primitive type도 Constant Pool에 있는 특정 상수를 참조하는 것이기 때문에 결국 주소값을 비교하는 것으로 볼 수 있다.
같은 상수를 참조하면 주소값이 같으니 결국 같은 값이면 동일하다고 판단할 수 있다.

public boolean equals(Object anObject) {
      if (this == anObject) {
          return true;
      }
      if (anObject instanceof String) {
          String anotherString = (String) anObject;
          int n = value.length;
          if (n == anotherString.value.length) {
              char v1[] = value;
              char v2[] = anotherString.value;
              int i = 0;
              while (n-- != 0) {
                  if (v1[i] != v2[i])
                          return false;
                  i++;
              }
              return true;
          }
      }
      return false;
  }

class Sub {

    int x;
    String a;

    @Override
    public boolean equals(Object obj) {

        //객체 단위 비교
        if (this == obj)  // 자기 자신이 비교 대상으로 들어왔으면 true
            return true;
        if (obj == null)  // 메모리 주소가 없는 객체라면 false
            return false;
        if (getClass() != obj.getClass())   // 비교 대상 둘이 다른 클래스라면 false
            return false;  // 필드와 값이 완전히 같더라도 다른 클래스 소속이면 false

        //객체의 내용 비교
        Sub other = (Sub) obj;  // Object 타입으로 들어왔으므로 비교를 위해 형변환
        if (a == null) {  // 문자열 비교해서 다르면 false
            if (other.a != null)
                return false;
        } else if (!a.equals(other.a))
            return false;
        if (x != other.x)  // int(원시 타입) 비교해서 다르면 false
            return false;
        return true;  // 모두 같으면 true 리턴
    }
}
  https://gardeny.tistory.com/31
  https://ojava.tistory.com/15
 */