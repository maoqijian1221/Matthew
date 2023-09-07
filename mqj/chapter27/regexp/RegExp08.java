package com.mqj.chapter27.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//演示非捕获分组, 语法比较奇怪

public class RegExp08 {
    public static void main(String[] args) {

        String content = "hello哈佛教育 jack哈佛老师 哈佛同学hello哈佛学生";

//        找到 哈佛教育、哈佛老师、哈佛同学 子字符串
        //String regStr = "哈佛教育|哈佛老师|哈佛同学";
        //上面的写法可以等价非捕获分组, 注意：不能 matcher.group(1)
        //String regStr = "哈佛(?:教育|老师|同学)";

        //找到 哈佛 这个关键字,但是要求只是查找哈佛教育和 哈佛平老师 中包含有的哈佛
        //下面也是非捕获分组，不能使用 matcher.group(1)
        //String regStr = "哈佛(?=教育|老师)";

        //找到 哈佛 这个关键字,但是要求只是查找 不是 (哈佛教育 和 哈佛老师) 中包含有的哈佛
        //下面也是非捕获分组，不能使用 matcher.group(1)
        String regStr = "哈佛(?!教育|老师)";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
