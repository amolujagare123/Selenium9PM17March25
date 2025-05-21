package TestNGDemo.Demo2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classOneTest1(String url,String username,String password)
    {
      /*  String url = "http://example1.com";
        String username = "admin";
        String password = "admin123";*/
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);

        System.out.println("classOneTest1");
    }

    @Test (groups = "email")
    public void classOneTest2() {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3() {
        System.out.println("classOneTest3");
    }
}
