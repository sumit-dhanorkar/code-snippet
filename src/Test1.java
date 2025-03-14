import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        /*
            values() -> getting each constants in array
            ordinal() -> this will gives default value of enum constant as here
            we don't provide any custom value to enum constants.  

         */
//        for (EnumSample enumSample:EnumSample.values()){
//            System.out.println(enumSample.ordinal());
//        }

        /*
            valueOf()->
            name()->
         */

//        EnumSample enumSample1=EnumSample.valueOf("FRIDAY");
//        System.out.println(enumSample1);
//        System.out.println(enumSample1.name());

//        EnumSample enumSampleFriday=EnumSample.FRIDAY;
//        enumSampleFriday.dummyMethod();
//
//        EnumSample enumSampleMonday =EnumSample.MONDAY;
//        enumSampleMonday.dummyMethod();

//        System.out.println(Arrays.toString(decrypt(new int[]{5, 7, 1, 4}, 3)));
//        System.out.println(isCircularSentence("Leetcode eisc cool"));
        System.out.println(rankTeams(new String[]{"WXYZ","XYZW"}));

    }

    public static String rankTeams(String[] votes) {
        if(votes.length == 1) return votes[0];

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < votes.length; i++){
            TreeMap<Character, Integer> map = new TreeMap<>();

            for(int j = 0; j < votes.length; j++){
                map.put(votes[j].charAt(0), map.getOrDefault(votes[j].charAt(0), 0) + 1);
            }

            int maxVotes=Integer.MIN_VALUE;

            for(Map.Entry<Character, Integer> entry : map.entrySet()){
               if(entry.getValue() > maxVotes){
                   ans.append(entry.getKey());
               }else {
                   ans.append(entry.getKey());
               }
            }

        }

        return new String(ans).substring(0,votes[0].length());
    }


    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split("\\s");
        if(words.length==1){
            return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);
        }



        int count=0;
        for(int i = 0; i < words.length-1; i++) {
            char endCh=words[i].charAt(words[i].length()-1);
            char nextStartCh=words[i+1].charAt(0);

            if(endCh==nextStartCh) {
                count++;
            }
        }

        return count == words.length - 1;
    }


    public static int[] decrypt(int[] code, int k) {
        if(k==0){
            Arrays.fill(code,0);
            return code;
        }


        int n=code.length;
        int[] res=new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
            }

            res[i] = sum;
        }


        return res;
    }

}

/*
output:
    Default dummy method
    Monday dummy method
*/









