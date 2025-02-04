package static1;

public class Data3 {
    public String name;
    public static int count; // static 붙었다 -> 공용 변수로 사용하겠다

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
