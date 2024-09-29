
import java.util.Random;

public class codeCreate{
    public static void main(String[] args){
        //目标：完成生成随机验证码。
        System.out.println(createCode(5));
    }

    public static String createCode(int n){
        //1.定义一个for循环用于控制产生n位随机字符
        Random r = new Random();
        //3.定义一个String类型的变量用于记录产生的每位随机字符
        String code = "";
        for(int i = 1; i<=n; i++){
            //2.为每个位置随机产生一个随机字符，该字符有可能是数字，有可能是大写字母
            //思路：随机产生一个0或1的数字，0代表随机一个数字，1代表随机一个字母
            int type = r.nextInt(2); //0 1
            switch (type){
                case 0:
                    //随机一个数字
                    code += r.nextInt(10); //0-9
                    break;

                case 1:
                    //随机一个字母 A是65 Z是65+25
                    char ch= (char)(65 + r.nextInt(26));
                    code += ch;
                    break;
            }
        }

        return code;
    }
}
