package Java.day15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ToolsTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String value = format.format(date);
        System.out.println(value);
//   2026.3.14 是2026你年的第几周
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.YEAR,2026);
        calendar.set(calendar.MONTH,2);
        calendar.set(calendar.DAY_OF_MONTH,14);
        int i=calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println(i);
//        20263.14 200天后的日期
        int day=calendar.get(Calendar.DAY_OF_YEAR);
        day = day+200;
        calendar.set(Calendar.DAY_OF_YEAR,day);
        Date time=calendar.getTime();
        System.out.println(time);
        value=format.format(time);
        System.out.println(value);
    }
}
