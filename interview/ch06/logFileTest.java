package interview.ch06;

import java.util.ArrayList;

class logFileTest {
    public static void main(String[] args) {
        String[] arrLog = {"id1 8 1 5 1", "id2 art can", "id3 3 6", "id4 own kit dig", "id5 art zero"};
         sortArray(arrLog);
    }

    public static void sortArray(String[] arrParam){
        String[] arrLogs = arrParam;
        ArrayList<String> strList = new ArrayList();
        ArrayList<String> digList = new ArrayList();
        ArrayList<String> merList = new ArrayList();
        try{
            //문자 로그가 숫자로그보다 앞에옴. 문자는 a-z 숫자는 입력순
            for(int i = 0; arrLogs.length > i; i++ ){
                String log = arrLogs[i];

                if(Character.isDigit(log.split(" ")[1].charAt(0))){
                    digList.add(log);
                }else{
                    strList.add(log);
                    strList.sort(String.CASE_INSENSITIVE_ORDER);
                }
            }

            merList.addAll(strList);
            merList.addAll(digList);

            System.out.println(merList);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
