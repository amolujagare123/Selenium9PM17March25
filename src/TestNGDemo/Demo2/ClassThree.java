package TestNGDemo.Demo2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {



    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classThreeTest1(String url,String username,String password)
    {
       /* String url = "http://example1.com";
        String username = "admin";
        String password = "admin123";*/
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
        System.out.println("classThreeTest1");
    }

    @Test(groups = "email")
    public void classThreeTest2() {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3() {
        System.out.println("classThreeTest3");
    }
}

