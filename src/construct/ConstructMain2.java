package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("member1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("member2", 14);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("name: " + s.name + ", age: " + s.age + ", grade: " + s.grade);
        }
    }
}
