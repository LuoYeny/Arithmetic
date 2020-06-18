package Interview.huawei;

import java.util.*;

public class Main {
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

        ArrayList<HashMap<Integer,Integer>> mapList = new ArrayList ();
        HashMap<Integer,Integer> map=new HashMap();
        for (int i = 0; i < N ; i++) {

            map.put(sc.nextInt(),sc.nextInt());

        }
        System.out.println(map.toString());
        int rel = solution(arrayList,map);
        System.out.println(rel);
    }

    private static int solution(ArrayList<Integer> arrayList, HashMap<Integer, Integer> map) {
        int rel=0;
        Collections.sort(arrayList);
        Set<Integer> set=map.keySet();
//        Iterator it =set.iterator();
//        while (it.hasNext()){
//            Integer a=(Integer)it.next();
//            if(a>arrayList.get(arrayList.size()-1)){
//                map.remove(a);
//            }
//        }
        //System.out.println(map.toString());
       while (!map.isEmpty()){
            int maxKey = getMaxKey(map);

            for (int j = 0; j <arrayList.size() ; j++) {
                if(maxKey<=arrayList.get(j)){
                    rel=rel+map.get(maxKey);
                    arrayList.remove(j);
                }
                map.remove(maxKey);
                break;


            }
            
        }

        return rel;
    }

    private static int getMaxKey(HashMap<Integer, Integer> map) {
        int max=0;
        int maxKey=0;
        for(Integer key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                maxKey=key;
            }

        }
        return maxKey;
    }

    //求valus最大的key
    


}
