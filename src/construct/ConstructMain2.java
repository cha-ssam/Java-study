package construct;

public class ConstructMain2 {

    public static void main(String[] args) {
        MemberConstruct meber1 = new MemberConstruct("user1" , 15,90);
        MemberConstruct meber2 = new MemberConstruct("user2" , 15);

        MemberConstruct[] members = {meber1,meber2};

        for (MemberConstruct member : members) {
            System.out.println(member.name + member.grade + member.age);

        }
    }
}
