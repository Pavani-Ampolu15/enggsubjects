public class StrWrapper
{
    public static void main(String args[])
    {
        String str="Ramaiah";
        System.out.println("the replacement of R with s :"+ str.replace("R","s"));
        StringBuffer sb=new StringBuffer("SomeThing");
        sb.setCharAt(5,'L');
        System.out.println(sb);
        String immutable=new String("HELLO!");
        System.out.println(immutable);
        String str1=immutable.concat("World!");
        System.out.println(str1);
        System.out.println(immutable);
        StringBuffer sbi=new StringBuffer("GOOD");
        System.out.println(sbi);
        sbi.append("NIGHT");
        System.out.println(sbi);
    }
}