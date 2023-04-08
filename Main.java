package Simform.Inheritance.exmaple;

public class Main {
  public static void main(String[] args) {
    //child can access all parent attribute and method
    //parent can't access all child attribue and method

    //reference -> attribue
    //object -> method
    EmailService emailService = new BEmailServcieImpl();
    emailService.sendEmail("hello parth");
    System.out.println(emailService.a);
  }
}
