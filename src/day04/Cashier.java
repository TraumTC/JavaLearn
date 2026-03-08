package day04;

public class Cashier {
    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void showPrice(){
        this.member.buyBook();
    }

    public void set(Member member){
        member.buyBook();
    }
    public Member get(String name){
        switch(name){
            case"ordinaryMember":
                return new OrdinaryMember();
            case"vipMember":
                return new vipMember();
            case"svipMember":
                return new SvipMember();
        }
        return null;
    }
}
