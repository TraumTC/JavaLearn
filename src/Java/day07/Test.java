package Java.day07;

public class Test {
    static void main(String[] args) {

        try{
            System.out.println(10/2);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace(System.out);
            System.out.println("错误，除数不能为0");
        }finally{
            System.out.println("运行结束");
        }
        User u = new User();
        try {
            u.test(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Test t=new Test();
        try {
            int add=t.add(9);
            System.out.println(add);
        }catch(MyNumberException e){
            e.printStackTrace();
        }
    }
    public int add(Object object) throws MyNumberException {
        if (!(object instanceof Integer)) {
            throw  new MyNumberException("传入的参数不是整型类型");
        }else{
            int num=(int)object;
            return num;
        }
    }
}
