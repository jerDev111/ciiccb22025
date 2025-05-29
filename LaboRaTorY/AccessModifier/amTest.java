package LaboRaTorY.AccessModifier;
public class amTest{


    public void cookFood1(){
     System.out.println("cook adobo");
    }

     private void cookFood2(){
     System.out.println("cook paksiw");
    }

     protected  void cookFood3(){
     System.out.println("cook menudo");
    }

    void cookFood4(){
        System.out.println("cook pancit");
    }

    public static void main(String[] args) {
        amTest o1 = new amTest();
        o1.cookFood1();
        o1.cookFood2();
        o1.cookFood3();
        o1.cookFood4();

        
      
    }
}

 class exNum1 extends amTest{

    public static void main(String[] args) {
        exNum1 o3 = new exNum1();
        o3.cookFood4();

    }
}







