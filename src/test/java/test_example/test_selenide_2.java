package test_example;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class test_selenide_2 {
    @Test
    public void userCanSearchKeywordWithGoogle() {

        System.setProperty("selenide.startMaximized", "true"); //устанавливается максимальный размер окна
        open("http://google.com");
        $(By.name("1")).setValue("Selenide").pressEnter(); // ($ - поиск элемента) клик на строку поиска и ввод Selenide
        Selenide.sleep(1000);


    }


}
