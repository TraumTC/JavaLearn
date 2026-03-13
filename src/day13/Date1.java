package day13;

public class Date1 implements Comparable{
    private int num;
    public Date1(int num) {
        this.num=num;
    }

    /**
     * A.compareTo(B)
     * A>B:-1
     * A<B:1
     * A=B:0
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Date1 date1 = (Date1) o;
        if(this.num==date1.num){
            return 0;
        }
        if(this.num<date1.num){return 1;}
        if(this.num>date1.num){return -1;}
        return 0;

    }
    @Override
    public String toString() {
        return "num{" +
                "num=" + num +
                "}";
    }
}

