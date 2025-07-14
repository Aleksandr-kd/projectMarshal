package tests.search;

import org.testng.annotations.Test;

public class TestSOUT {

    @Test(invocationCount = 3, successPercentage = 50, dataProvider = "dataProviderMethod",
            dataProviderClass = DataProviderClass.class)
    // тест запустить 3 раза, процент прохождения 50 %. дата провайдер- передача тестовых данные
    public void testSOUT(String number, String string) {
        System.out.println("TEST SOUT!!!!!!!" + number + string);
    }
}
