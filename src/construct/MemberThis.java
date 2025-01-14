package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; //  이런 경우에는 this가 생략되어있다고 볼 수 있다.
    }
}
