package it.heima.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        String data = "来黑马程序员学习Java，" +
                "电话：18666668888，18699997777或者联系" +
                "邮箱：boniu@itcast.cn 邮箱：bozai@itcast.cn 邮箱2：dlei0009@163.com" +
                "座机电话：01036517895，010-98951256 " +
                "热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";
        String regex="[1][3-9]\\d{9}|[a-zA-Z0-9]{6,18}@[a-zA-Z0-9]+[.][a-zA-Z0-9]{0,2}[.]?[a-zA-Z]{2,3}|[0][1][0][-]?\\d{8}|[4][0][0][-]?\\d{3}[-]?\\d{4}";
        // 1. 将正则表达式封装为 Pattern 对象
        Pattern pattern = Pattern.compile(regex);

        // 2. 获取匹配器对象
        Matcher matcher = pattern.matcher(data);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
