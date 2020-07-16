//package Interview.huawei;
//
//import zuochenyun.list.listIntersect11.Node;
//
//import java.util.*;
//
//public class List {
//    public class Node {
//        int value;
//         Node next = null;
//
//        public Node(int value) {
//            this.value = value;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s =sc.nextLine();
//        ArrayList<Integer> arrayList = solution(s);
//        for (int i = 0; i <arrayList.size() ; i++) {
//            System.out.print (arrayList.get(i)+" ");
//        }
//    }
//
//    private static ArrayList<Integer> solution(String s) {
//
//       String[] arr= s.split(" ");
//
//       Set<Integer> set = new HashSet<Integer>();
//        ArrayList<Integer> arrayList = new ArrayList();
//        for (int i = 0; i <arr.length; i++) {
//            int a=  Integer.valueOf(arr[i].toString()).intValue();
//            set.add(a);
//        }
//        Iterator it= set.iterator();
//        while (it.hasNext()){
//            Integer a =(Integer) it.next();
//
//            arrayList.add(a);
//            arrayList.add(a);
//            arrayList.add(a);
//        }
//
//
//         Collections.sort(arrayList);
//
//        return arrayList;
//    }
//}
