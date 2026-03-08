package day04;

public class Test {
    static void main(String[] args) {
        OrdinaryMember o = new OrdinaryMember();
        vipMember v = new vipMember();
        SvipMember s = new SvipMember();
        Member m = new Member();
        Cashier cashier = new Cashier();
        cashier.setMember(s);
        cashier.showPrice();
        cashier.set(v);


//
        Cashier c = new Cashier();
        Member member=c.get("vipMember");
        System.out.println(member);
    }
}
