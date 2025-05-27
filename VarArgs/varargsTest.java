package VarArgs;

public class varargsTest {

    public int testM1(int... x){
        int val=0;
        for (int f1 : x)
        val+=f1;

       return val;

    }

    public static void main(String[] args) {
        varargsTest o1 = new varargsTest();
        int [] ar1 = {3,4,2,};
        System.out.println(o1.testM1(1,2,3,4));
        System.out.println(o1.testM1(ar1));

        
    }
    
}

abstract interface CanBarrow{
    public static final int MINIMUM= 3;
}
