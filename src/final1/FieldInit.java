package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;  // 자바의 관례. 스태틱 파이널(상수)이 붙으면 대문자
    final int value = 10;

//    public FieldInit(int value) {
//        this.value = value; // 초기값이 이미 있으니까 ConstructInit과 달리 안됨
//    }
}
