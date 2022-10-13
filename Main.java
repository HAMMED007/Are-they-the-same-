

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};





     System.out.println(AreSame.comp(a,b));


    }

    public class AreSame {

        public static boolean comp(int[] a, int[] b) {

            int[] new_number = java.util.Arrays.stream(a).distinct().toArray();
            int[] new_number2 = java.util.Arrays.stream(b).distinct().toArray();
            int count = 0;

            if ((a == null) || (b == null)){
                return false;
            }


            for (int i = 0; i <new_number.length ; i++) {
                for (int j = 0; j < new_number2.length; j++) {
                    if(new_number[i] * new_number[i] == new_number2[j]){

                        count++;
                    }

                }
            }

            if(new_number.length == count && new_number2.length == count){
                return true;
            }


            return false;
        }
    }


}