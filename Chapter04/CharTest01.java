CharTest01.java
/*
    字符型：
    char
    1、char占用两个字节
    2、char的取值范围为：【0 - 65535】
    3、char采用unicode编码方式
    4、char类型的字面量用单引号括起来
    5、char可以存储一个汉字
*/
public class CharTest01
    public static void main(String[] args){
        //char可以存储1个汉字吗？	
        //可以的，汉字占用2个字节，java中的char类型占用2个字节，正好。
        char c1 = '中';
        System.out.println(c1);
        char c2 = 'a';
        System.out.println(c2);
        char c3 = '0'; //0在这里是字符，不是数字
        System.out.println(c3); 
            
        // 错误: 不兼容的类型: String无法转换为char
        //char c4 = "a";
        // 错误: 未结束的字符文字（它认为'a后面应该是个'，但是没有读取到该字符，所以报错：“未接束的字符文字”
        //char c5 = 'ab';
        // 错误: 未结束的字符文字
        //char c6 = '1.08';       
    }
    
运行步骤：
    1、javac *.java 把所有.java文件进行编译，生成字节码文件.class
    2、java CharTest01.java 运行CharTest01.java文件
结果：
    C:\Users\Administrator\Desktop>java CharTest01.java
    中
    a
    0
