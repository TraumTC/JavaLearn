package Java.day16;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        File file=new File("src\\Java.day16\\test.txt");
        System.out.println(file.exists());
        System.out.println(file.length());
        File file1=new File("src/Java.day16/456.jpg");
        System.out.println(file1.exists());
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File file2=new File("src/Java.day16");
//        判断是否存在
        System.out.println(file2.exists());
//        判断是否是目录
        System.out.println(file2.isDirectory());
//        判断是否是文件
        System.out.println(file2.isFile());
//        删除456.jpg
        System.out.println(file1.delete());
//        获取文件所在路径
        System.out.println(file.getParent());
//        获取文件名称
        System.out.println(file.getName());

        byte[] bytes1=null;
//       字节流 输入字节流
        InputStream inputStream=null;
        InputStream inputStream1=null;

        try {
            inputStream= new FileInputStream(file);
            inputStream1= new FileInputStream(file);
            long size=file.length();
            int available=inputStream.available();
            System.out.println("当前未读取的数据个数为：" + available);
            byte[] bytes=new byte[(int) size];
            bytes1=bytes;
            inputStream1.read(bytes);
//            打印bety 中文为负数     -128-127
            for(byte b:bytes){
                System.out.println(b);
            }
//          打印int类型  中文为正数    0-255
            for (long i = 0; i < size; i++) {
                int value=inputStream.read();
                System.out.println(value);
                int available1=inputStream.available();
                System.out.println("当前未读取的数据个数为：" + available1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                inputStream1.close();
            } catch (IOException e) {}
        }

//        字节流 输出流
        File file3=new File("src/Java.day16/test1.txt");
        try {
//            file3.createNewFile();
            OutputStream outputStream=new FileOutputStream("src/Java.day16/test1.txt");
            outputStream.write(bytes1);
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        字符流  输入
        try {
            Reader read = new FileReader(file);
            int temp=0;
            while ((temp=read.read())!=-1) {
                System.out.println(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        字符流  输出
//        字符流必须刷新或者关闭 数据才会真正写入文件。
        Writer writer = null;
        File file4 =  new File("src/Java.day16/test2.txt");
        try {
//            file4.createNewFile();
            writer = new FileWriter(file4);
            String str ="你好世界！";
            writer.write(str);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        通过输入输出流 复制文件
//        这里复制图片 使用字节流  ,不能使用字符流
        InputStream inputStream2=null;
        OutputStream outputStream2=null;
        try {
            inputStream2=new FileInputStream("src/Java.day16/123.jpg");
            long size=inputStream2.available();
            byte[] bytes=new byte[(int) size];
            bytes = inputStream2.readAllBytes();
            outputStream2=new FileOutputStream("src/Java.day16/456.jpg");
            outputStream2.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream2.close();
                outputStream2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        使用字符流复制文件
        Reader reader=null;
        Writer writer2=null;
        try {
            reader = new FileReader("src/Java.day16/test2.txt");
            String str =null;
            str =reader.readAllAsString();
            writer2 = new FileWriter("src/Java.day16/cptest3.txt");
            writer2.write(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                reader.close();
                writer2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
