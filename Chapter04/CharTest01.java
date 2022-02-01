public class CharTest01{
    public static void main(String[] args){
        //char可以存储1个汉字吗？	
        //可以的，汉字占用2个字节，java中的char类型占用2个字节，正好。
        char c1 = '中';
        System.out.println(c1);
        char c2 = 'a';
        System.out.println(c2);
        char c3 = '0';
        System.out.println(c3);            
    }
}
