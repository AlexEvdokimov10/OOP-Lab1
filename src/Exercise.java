import java.lang.reflect.Method;
import java.util.Arrays;

public class Exercise {
    /*Створіть метод, який приймає на вхід рядок та на виході змінює регістри букв на протилежні.
    Приклад - на вході "рУматРОн" на виході "РуМАТроН"       */
    public String RegistrLetters(String str) {


        char[] symbol = str.toCharArray();
        for (int i = 0; i < symbol.length; i++) {
            if (Character.isUpperCase(symbol[i])) {
                symbol[i] = Character.toLowerCase(symbol[i]);
            } else {
                symbol[i] = Character.toUpperCase(symbol[i]);
            }
        }
        str = String.valueOf(symbol);
        return str;
    }
    /*
    Створіть метод, який сортує масив String у порядку довжини рядків
     */
    public String SortString(String[] str) {
        String temp = "";
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if (str[j + 1].length() < str[j].length()) {
                    temp = str[j + 1];
                    str[j + 1] = str[j];
                    str[j] = temp;
                }

            }

        }
        return Arrays.toString(str);

    }
    /*
    Створіть метод, який рекурсивно рахує суму елементів масиву int[] , який передається як параметр методу
     */
    static int i=0;
    static int count=0;
    public static int Rekursiv(int[]array){
        i++;
        if(i>array.length){
            return 0;
        }
        count+=array[i-1];
        Rekursiv(array);
        return count;
    }
/*

 */
    public static String Cyr2lat(char ch){
        switch (ch){
            case 'а': return "a";
            case 'б': return "b";
            case 'в': return "v";
            case 'г': return "g";
            case 'д': return "d";
            case 'е': return "e";
            case 'ж': return "zh";
            case 'з': return "z";
            case 'и': return "i";
            case 'і': return "i";
            case 'ї':return "ii";
            case 'й': return "y";
            case 'к': return "k";
            case 'л': return "l";
            case 'м': return "m";
            case 'н': return "n";
            case 'о': return "o";
            case 'п': return "p";
            case 'р': return "r";
            case 'с': return "s";
            case 'т': return "t";
            case 'у': return "u";
            case 'ф': return "f";
            case 'х': return "kh";
            case 'ц': return "c";
            case 'ч': return "ch";
            case 'ш': return "sh";
            case 'щ': return "jsh";
            case 'є': return "ye";
            case 'ю': return "ju";
            case 'я': return "ia";
            case 'А': return "A";
            case 'Б': return "B";
            case 'В': return "V";
            case 'Г': return "G";
            case 'Д': return "D";
            case 'Е': return "E";
            case 'Ж': return "ZH";
            case 'З': return "Z";
            case 'И': return "I";
            case 'Й': return "Y";
            case 'К': return "K";
            case 'Л': return "L";
            case 'М': return "M";
            case 'Н': return "N";
            case 'О': return "O";
            case 'П': return "P";
            case 'Р': return "R";
            case 'С': return "S";
            case 'Т': return "T";
            case 'У': return "U";
            case 'Ф': return "F";
            case 'Х': return "KH";
            case 'Ц': return "C";
            case 'Ч': return "CH";
            case 'Ш': return "SH";
            case 'Щ': return "JSH";
            case 'Є': return "YE";
            case 'Ю': return "JU";
            case 'Я': return "IA";
            default: return String.valueOf(ch);
        }
    }
    public static String Cyr2lat(String s){
        StringBuilder sb = new StringBuilder(s.length()*2);
        for(char ch: s.toCharArray()){
            sb.append(Cyr2lat(ch));
        }
        return sb.toString();
    }
    /*
    Створіть метод, який приймає будь-яку кількість масивів int[] та повертає найменше число яке є у складі цих масивів
     */
        public int Array(int [][] arr){
        int min=0;
        int []temparr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            min=arr[i][0];
            for (int j=0 ;j<arr[i].length-1;j++)
            {
                if(arr[i][j]<min){
                    min=arr[i][j];
                }

            }
            temparr[i]=min;
        }
        min=temparr[0];
        for(int i=0;i<temparr.length-1;i++) {

            if (temparr[i]<min) {
                min = temparr[i];
            }

        }
        return min;
    }



        public static void main(String[] args) {
            Exercise symbols = new Exercise();

            String[] seasons = {"Winter2", "Spring25", "Summer", "Autumn"};
            int[] array = {1, 5, 4, 3, 7};
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            System.out.println(symbols.RegistrLetters("WHat"));
            System.out.println(symbols.SortString(seasons));
            System.out.println(Cyr2lat("ПРИВЕТ"));
            System.out.println(symbols.Array(matrix));
            System.out.println(Rekursiv(array));

        }
    }












