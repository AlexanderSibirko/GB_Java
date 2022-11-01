import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/*
Write a function that accepts a square matrix (N x N 2D array) 
and returns the determinant of the matrix.

How to take the determinant of a matrix -- it is simplest to start with the smallest cases:

A 1x1 matrix |a| has determinant a.

A 2x2 matrix [ [a, b], [c, d] ] or

|a  b|
|c  d|
has determinant: a*d - b*c.

The determinant of an n x n sized matrix is calculated by reducing 
the problem to the calculation of the determinants of n matrices ofn-1 x n-1 size.

For the 3x3 case, [ [a, b, c], [d, e, f], [g, h, i] ] or

|a b c|  
|d e f|  
|g h i|  
the determinant is: a * det(a_minor) - b * det(b_minor) + c * det(c_minor) 
where det(a_minor) refers to taking the determinant of the 2x2 matrix created 
by crossing out the row and column in which the element a occurs:

|- - -|
|- e f|
|- h i|  
Note the alternation of signs.

The determinant of larger matrices are calculated analogously, 
e.g. if M is a 4x4 matrix with first row [a, b, c, d], then:

det(M) = a * det(a_minor) - b * det(b_minor) + c * det(c_minor) - d * det(d_minor) 
*/

/**
 * Kata4MatrixDeterminant
 */
public class Kata4MatrixDeterminant {
    public static void main(String[] args) {
        //System.out.println(Kata.sumStrings("5484870336636", "513157086153"));
        //System.out.println(Kata.mix("looping is fun but dangerous", "less dangerous than coding"));
        System.out.println(Kata.dblLinear(10));
        System.out.println(Kata.dblLinear(20));
        System.out.println(Kata.dblLinear(30));
        System.out.println(Kata.dblLinear(50));
        System.out.println(Kata.dblLinear(20000));
        
    }

    public static int determinant(int[][] matrix) {
        int determinant = 0;
        if (matrix.length == 1) {
            return matrix[0][0];
        } else if (matrix.length == 2) {
            return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
        } else {
            for (int j = 0; j < matrix.length; j++) {
                int[][] minorMatrix = new int[matrix.length-1][matrix.length-1];
                for (int iMinor = 0; iMinor < minorMatrix.length; iMinor++) {
                    for (int jMinor = 0; jMinor < minorMatrix.length; jMinor++) {
                        if (jMinor < j) {
                            minorMatrix[iMinor][jMinor] = matrix[iMinor+1][jMinor];
                        } else {
                            minorMatrix[iMinor][jMinor] = matrix[iMinor+1][jMinor+1];
                        }
                    }
                }
                if (j%2 == 0) {
                    determinant += matrix[0][j] * determinant(minorMatrix);
                } else {
                    determinant -= matrix[0][j] * determinant(minorMatrix);;
                }
            }
        }
        return determinant;
    }    


    public class Kata {
        public static String sumStrings(String a, String b) {
        a = a.replaceFirst("^0+(?!$)", "");
        b = b.replaceFirst("^0+(?!$)", "");

        if (a.length() < b.length()) {
            String t;
            t = a;
            a = b;
            b = t;
        }
        
        StringBuilder sb = new StringBuilder();
        int diff = a.length() - b.length();
        int addition = 0;
        for (int i = a.length()-1 ; i >= 0 ; i--) {
            if (i-diff >= 0) {
                if (a.charAt(i) + b.charAt(i-diff) + addition <= Character.valueOf('0') + Character.valueOf('9')) {
                    sb.append((char)(a.charAt(i) + b.charAt(i-diff) - Character.valueOf('0') + addition));
                    addition = 0;
                } else {
                    sb.append((char)(a.charAt(i) + b.charAt(i-diff) - Character.valueOf('0') - 10 + addition));
                    addition = 1;
                }
            } else {
                if (a.charAt(i) < Character.valueOf('9')) {
                   sb.append((char)(a.charAt(i) + addition + 0));
                   addition = 0;
                } else {
                   sb.append((char)(a.charAt(i) + addition - 10));
                   addition = 1;
                }
            }
        }
        if (addition == 1) sb.append("1");

        return sb.reverse().toString();
        }

        public static String mix(String s1, String s2) {
            // your code
            s1 = s1.replaceAll("[^a-z]+", "");
            s2 = s2.replaceAll("[^a-z]+", "");

            StringBuilder sb = new StringBuilder();
            Map<String, Integer> s1Map = createCharMap(s1);
            Map<String, Integer> s2Map = createCharMap(s2);
            List<String> mixList = new ArrayList<>();
            List<String> resultMixList = new ArrayList<>();

            mixList.addAll(mapToMixList(s1Map, "1:"));
            mixList.addAll(mapToMixList(s2Map, "2:"));

            Collections.sort(mixList, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
            System.out.println(mixList.toString());

            while (mixList.size() > 1)
            {
                String curLetter = mixList.get(0).substring(mixList.get(0).length()-1);
                for (int i = 1; i < mixList.size(); i++) {
                    if (mixList.get(i).length() < mixList.get(0).length()){
                        resultMixList.add(mixList.get(0));
                        break;
                    } else {
                        if (mixList.get(i).endsWith(curLetter)){
                            resultMixList.add(mixList.get(0).replaceFirst("[12]","="));
                            break;
                        } else {
                            if (i == mixList.size()-1) {
                                resultMixList.add(mixList.get(0));
                            }
                        }
                    }
                }
 
                mixList.removeIf(x -> (x.endsWith(curLetter)));
            }

            if (mixList.size() > 0) {
                resultMixList.add(mixList.get(0));
            }

            Collections.sort(resultMixList, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));

            return String.join("/", resultMixList);
          }

          private static Map<String, Integer> createCharMap(String string){
            TreeMap<String, Integer> charMap = new TreeMap<>();
            for (char char_ : string.toCharArray()) {
                String str = String.valueOf(char_);
                int newValue;
                if (charMap.containsKey(str)) {
                    newValue = charMap.get(str) + 1;
                } else {
                    newValue = 1;
                }
                charMap.put(str,newValue);
            }
            return charMap;
          }

          private static List<String> mapToMixList(Map<String, Integer> charMap, String prefix){
            List<String> mixListAddition = new ArrayList<>();
            for (String str: charMap.keySet()) {
                int count = charMap.get(str);
                if (count > 1) {
                    mixListAddition.add(prefix + str.repeat(count));
                }
            }
            return mixListAddition;
          }


          public static int dblLinear (int n) {
            // your code
            if (n == 0) return 1;
            int cursor = 0;
            int x = 0;
            TreeSet<Integer> uSet = new TreeSet<>();
            uSet.add(1);
            uSet.iterator();
            boolean resume = true;
            ArrayList<Integer> list = new ArrayList<Integer>(uSet);
            while (resume){
                if (cursor > list.size()-1 || list.get(list.size()-1) > list.get(cursor)*2+1) {
                    list = new ArrayList<Integer>(uSet);
                }
                uSet.add(list.get(cursor)*2+1);
                uSet.add(list.get(cursor)*3+1);
                cursor += 1;
                if (uSet.size() > n) {
                    list = new ArrayList<Integer>(uSet);
                    int nTh = list.get(n);
                    int possibity = list.get(cursor)*2+1;
                    if (possibity > nTh){
                       return nTh;
                    }
                }
            }
            return 0;
        }
      }
}
