import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入日期：");
        String date = scanner.nextLine();

        // 定義正則表達式
        String regex = "^(\\d{4})/(\\d{2})/(\\d{2})|(\\d{2})/(\\d{2})/(\\d{4})$";

        // 使用Pattern和Matcher類進行匹配
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);

        if (matcher.matches()) {
            if (matcher.group(1) != null) {
                // 輸入格式為YYYY/MM/DD
                int year = Integer.parseInt(matcher.group(1));
                int month = Integer.parseInt(matcher.group(2));
                int day = Integer.parseInt(matcher.group(3));
                System.out.println("輸入的日期為：" + year + "年" + month + "月" + day + "日");
            } else {
                // 輸入格式為MM/DD/YYYY
                int month = Integer.parseInt(matcher.group(4));
                int day = Integer.parseInt(matcher.group(5));
                int year = Integer.parseInt(matcher.group(6));
                System.out.println("輸入的日期為：" + year + "年" + month + "月" + day + "日");
            }
        } else {
            System.out.println("輸入的日期格式不正確！");
        }
    }
}
