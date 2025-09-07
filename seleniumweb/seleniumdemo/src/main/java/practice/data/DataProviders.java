package practice.data;

public class DataProviders {

@org.testng.annotations.DataProvider
    public static Object[][] loginData()
    {
        return new Object[][]
                {
                        {
                            "tomsmith" ,"SuperSecretPassword!"
                        }
                };
    }
}
