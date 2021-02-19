package com.jsfd.week1.day3;

import java.util.*; 
class HashMapSort{ 
  
    static HashMap<Integer, String> hm = new HashMap<>(); 
    public static void sortkey(){ 
        ArrayList<Integer> sk = new ArrayList<Integer>(hm.keySet()); 
        Collections.sort(sk); 
        System.out.println("HashMap Sort by Keys");
        for (Integer x : sk){ 
            System.out.println("\tKey = " + x + ", Value = " + hm.get(x));
        } 
    } 
    
    // public static void sortvalue(){
    //     ArrayList<String> sv = new ArrayList<String>(hm.values());
    //     Collections.sort(sv);
    //     System.out.println("HashMap Sort by Values");
    //     for(String str:sv){
    //         System.out.println("Key = "+hm.values()+", Value = "+str);
    //     }
    // }
//-----------------------------------------------------------------------------------------------------------------
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm1){ 
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm1.entrySet()); 

        Collections.sort(list,new Comparator<Map.Entry<String, Integer> >(){
            public int compare(Map.Entry<String, Integer> ob1,Map.Entry<String, Integer> ob2){ 
                    return (ob1.getValue()).compareTo(ob2.getValue()); 
            } 
        }); 
 
        HashMap<String, Integer> result = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> me : list){ 
            result.put(me.getKey(), me.getValue()); 
        }  
        return result; 
    }

    public static void main(String args[]) { 
        
        hm.put(3, "Gohan"); 
        hm.put(8, "Yancha");
        hm.put(4, "Trunks"); 
        hm.put(2, "Vegeta"); 
        hm.put(6, "Pikalo"); 
        hm.put(1, "Goku"); 
        hm.put(5, "Goten"); 
        hm.put(7, "Krillen"); 
        System.out.println("\n"+hm);
        sortkey();
        //sortvalue();
 
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
 
        hm1.put("Gohan", 3); 
        hm1.put("Yancha", 8);
        hm1.put("Trunks", 4); 
        hm1.put("Vegeta", 2); 
        hm1.put("Pikalo", 6); 
        hm1.put("Goku", 1); 
        hm1.put("Goten", 5); 
        hm1.put("Krillen", 7);
        System.out.println("\n"+hm1);

        Map<String, Integer> map = sortByValue(hm1);
        System.out.println("HashMap Sort By Values");
        for (Map.Entry<String, Integer> entry : map.entrySet()){ 
            System.out.println("\tKey : " + entry.getKey()+ ", Value : "+ entry.getValue()); 
        }
    } 
}
