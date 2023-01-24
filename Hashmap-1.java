import java.util.*;

class HMap
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map=new HashMap<Integer,String>();
        map.put(12163, "LTT MAS Chennai Express");
        map.put(22159, "CSMT MAS Chennai Express");
        map.put(12123, "CSMT Pune Deccan Queen");
        map.put(12951, "MMCT NDLS Rajdhani");
        map.put(12925, "MMCT KLK Paschim Express");

        String train=map.get(12951);
        System.out.println(train);
        
    }
}