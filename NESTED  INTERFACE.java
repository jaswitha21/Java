interface A                 //outer interface 
{
  interface B {              //inner interface
   void msg();
 }
    void show();
  }
     class Nested implements A,A.B
    {
       public void msg()
    { 
        System.out.println("inner interface");
     } 
          public void show()
   {
     System.out.println("outer interface");
  } 
           public static void main(String args[])
           {
               Nested obj=new Nested();
               obj.msg();
               obj.show();
               }
               }
               
