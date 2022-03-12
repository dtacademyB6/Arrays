public class ScopeOfALocalVariable {






    public static void main(String[] args) {

        int g = 90;


         {

         int num = 89;

         }
//
//         System.out.println(num);
//         int i = 98;

        for (int i = 0; i < 3; i++) {

        }

        for (int i = 0; i < 3; i++) {

        }

//

        method1("Bla vbcs");

    }

     public static  void method1(String str){


         System.out.println(str);



     }




}
