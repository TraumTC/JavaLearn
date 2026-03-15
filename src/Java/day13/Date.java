package Java.day13;

public class Date {
    private int num;

    public Date() {
    }

    public Date(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        Date d = (Date)obj;
        if(this.num == d.num) return true;
        return false;
    }
    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public String toString() {
        return "num{" +
                "num=" + num +
                "}";
    }
}
