package Interview.huawei;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =0;
        int M =0;

            M=sc.nextInt();
            N=sc.nextInt();


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < M; i++) {
            arrayList.add(sc.nextInt());
        }

        ArrayList<Integer> keyList = new ArrayList ();
        ArrayList<Integer> valueList = new ArrayList ();

        for (int i = 0; i < N ; i++) {

             keyList.add(sc.nextInt());
             valueList.add(sc.nextInt());

        }
      //  System.out.println(keyList.toArray());

       int   rel = solution2(arrayList,keyList,valueList);
        System.out.println(rel);
    }

    private static int solution2(ArrayList<Integer> arrayList, ArrayList<Integer> keyList, ArrayList<Integer> valueList) {
        int rel=0;
        Collections.sort(arrayList);
        while (!keyList.isEmpty()&&!valueList.isEmpty()&&!arrayList.isEmpty()){
            int index = getMaxKey2(keyList,valueList);

            for (int j = 0; j <arrayList.size() ; j++) {
                if(keyList.get(index)<=arrayList.get(j)){
                    rel=rel+valueList.get(index);
                    arrayList.remove(j);
                }
                keyList.remove(index);
                valueList.remove(index);
                break;


            }

        }

        return rel;
    }

    private static int getMaxKey2(ArrayList<Integer> keyList, ArrayList<Integer> valueList) {
        int index=0;
        int max=0;
        for (int i = 0; i <valueList.size() ; i++) {
            if(valueList.get(i)>max){
                max=valueList.get(i);
                index=i;
            }
        }
        return index;
    }



}
