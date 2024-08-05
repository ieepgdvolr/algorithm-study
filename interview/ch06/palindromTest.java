package interview.ch06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class palindromTest {
    public static void main(String[] args) {
        String sMessage = "Do geese see God";
        boolean isPalindrom = isPalindrom(sMessage);
    }

    public static boolean isPalindrom(String sParam){
        String mes = sParam.toLowerCase();
        boolean isPalindrom = true;
        List<Character> mesList = new ArrayList<>();
        char[] arrMes = mes.toCharArray();
        for(char cMes : arrMes){
            if(cMes != ' '){
                mesList.add(cMes);
            }
        }

        List<Character> arrList = new ArrayList<>(mesList);
        Collections.reverse(arrList);

        for(int i = 0; i < mesList.size(); i++){
            if(!mesList.get(i).equals(arrList.get(i))){
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }
}
