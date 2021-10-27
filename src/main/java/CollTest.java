import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Project name(项目名称)：作业_Collection接口之往集合中添加元素
 * Package(包名): PACKAGE_NAME
 * Class(类名): CollTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/27
 * Time(创建时间)： 10:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */


/*
* 任务：接收给定的一行字符串，实现如下需求：
1.通过空格（一个）切割字符串；
2.创建任意一种类型的集合；
3.将切割后的字符串元素添加进集合；
4.打印集合。
*/


public class CollTest
{
    public static void main(String[] args)
    {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 第一步：接收给定的一行字符串
        Scanner input = new Scanner(System.in);
        String str;
        str = input.nextLine();
        // 第二步：切割字符串
        String[] str1 = str.split(" ");
        // 第三步：创建集合
        LinkedList<String> p = new LinkedList<>();
        // 第四步：往集合中添加元素
        for (String s:str1)
        {
            p.add(s);
            //System.out.println(s);
        }
        // 第五步：打印集合元素
        System.out.print("[");
        System.out.print(p.removeFirst()+", ");
        for (int i = 1; i < str1.length-1; i++)
        {
            System.out.print(p.removeFirst()+", ");
        }
        System.out.print(p.removeFirst());
        System.out.println("]");

        String inStr = input.nextLine();
        input.close();
        for (int i = 0; i < inStr.length();i++)
        {
            if (i%2==0)
            {
                System.out.println(inStr.charAt(i));
            }
        }
        /********** End **********/

    }
}
