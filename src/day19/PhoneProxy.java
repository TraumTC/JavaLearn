package day19;

public class PhoneProxy implements Phone{
    private Phone phone;
    public PhoneProxy() {
    }
    public PhoneProxy(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String salePhone() {
        System.out.println("代理模式启动...");
        return this.phone !=null ?this.phone.salePhone():"没有代理";
    }
}
