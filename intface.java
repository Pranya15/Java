interface B{
    void login();
}
//interface F{
   // void login();
//}
//class D implements B,F{
  //  public void login(){

  //  }
//}
class C implements B {
    public void login() {
      System.out.println("hie");
   }
      public static void main(String[] args) {
          C s1 = new C();
          s1.login();
      }
  }
