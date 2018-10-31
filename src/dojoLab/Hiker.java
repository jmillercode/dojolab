package dojoLab;
public class Hiker {

    public static String add(String number){
        if (number.length() == 0){
            return "0";
        }
        if (number.length() == 1){
            return number;
        }
        if (number.charAt(number.length() - 1) == ','){
            return "Number expected but EOF found.";
        }
        if (number.contains(",") || number.contains("\n")){
            String[] numArr = number.split(",|\n");
            int total = 0;
            for (String num: numArr){
                int  n = Integer.parseInt(num);
                total += n;
            }
            return "" + total;
        }
        /*if (number.startsWith("//")){
            String splitter = number.substring(2,3);
            String[] numArr = number.split("\n");
            
            int total = 0;
            for (String num: numArr){
                int  n = Integer.parseInt(num);
                total += n;
            }
            return "" + total;
        }*/
            
        return number;
    }
}
