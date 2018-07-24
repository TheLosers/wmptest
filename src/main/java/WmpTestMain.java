import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class WmpTestMain {
    public static final String str = ""; //a0c1z7
    public static final String str2 = "ahek"; //aehk
    public static final String str3 = "234986"; //234689

    public static void main(String[] args) {
        System.out.println("문자 입력");
        Scanner scan = new Scanner(System.in);

        System.out.println(solution(scan.nextLine()));
    }

    public static String solution(String str) {
        try {

            if(str == null || "".equals(str)){
                throw new CommonException("값이 없습니다");
            }
        char[] strArr = str.toCharArray();

        List<Character> intList = new ArrayList<Character>();
        List<Character> alpabetList = new ArrayList<Character>();
        List<Character> sortStringList = new ArrayList<Character>();

            // 문자열 알파벳과 숫자로 분리
            for (char eachChar : strArr) {
                if (Character.isDigit(eachChar)) {
                    intList.add(eachChar);
                } else if (Character.isAlphabetic(eachChar)) {
                    alpabetList.add(eachChar);
                } else {
                    throw new CommonException("NONE_ALPHABAT or NONE_NUMBER");
                }
            }
            //2. 순차적으로 알파벳, 숫자, 알파벳, 숫자 순으로 넣는다. (StringBuffer 이용)
            intList.sort(Comparator.naturalOrder());
            alpabetList.sort(Comparator.naturalOrder());


            if(intList.isEmpty()){
                sortStringList = alpabetList;
            } else {
                sortStringList = intList;
                for(int i = 0; i < alpabetList.size(); i++) {
                    intList.add(i * 2, alpabetList.get(i));
                }
            }
            StringBuffer sb = new StringBuffer();
            for(Character eachChar : sortStringList) {
                sb.append(eachChar);
            }
            return sb.toString();
        }catch (CommonException e ){
            System.out.println(e.getMsg());
        }catch (Exception e){
            System.out.println("알 수 없는 에러");
        }
        return "";
    }

}
