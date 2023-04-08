package Simform.Inheritance.exmaple;

public class AEmailServiceImpl extends EmailService{

  int a=1000;

  @Override
  public void sendEmail(String mail) {
    System.out.println("a");
    //fetch detail
    //call API http://provider.a.com/123/
    //request
//    {
//      "message":"hello parth",
//      "messageId":"1",
//    }
  }
}
