import java.util.*;
public class EncodedThreeStrings {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String[] str={"John","Johny","Janardhan"};
        String[] s1=new String[str.length];
        String[] s2=new String[str.length];
        String[] s3=new String[str.length];
        int a,b;
        String f="";
        String se="";
        String t=" ";
        String o1="";
        String o2="";
        String o3="";
        for(int i=0;i<str.length;i++)
        {
            a=str[i].length()/3;
            b=str[i].length()%3;
            if(b==1)
            {
                s1[0]=str[i].substring(0,a);
                s1[1]=str[i].substring(s1[0].length(),s1[0].length()+a+b);
                s1[2]=str[i].substring(s1[0].length()+s1[1].length(),str[i].length());
            }
             if(b==2)
            {
                s2[0]=str[i].substring(0,a+1);
                s2[1]=str[i].substring(s2[0].length(),s2[0].length()+a);
                s2[2]=str[i].substring(s2[0].length()+s2[1].length(),str[i].length());
            }
            if(b==0)
            {
                s3[0]=str[i].substring(0,a);
                s3[1]=str[i].substring(s3[0].length(),s3[0].length()+a);
                s3[2]=str[i].substring(s3[0].length()+s3[1].length(),str[i].length());
            }
           
            
        }
        o1=s1[0]+s2[0]+s3[0];
        o2=s1[1]+s2[1]+s3[1];
        o3=s1[2]+s2[2]+s3[2];
        String no3="";
        char[] ch=o3.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isLowerCase(ch[i]))
            {
                no3=no3+Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(no3);
    }
}