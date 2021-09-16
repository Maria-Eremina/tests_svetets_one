package test_example;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class test_selenide_1 {

    public static void main(String[] args) {
        searchFor("Hello!");
    }

    public static void searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
    }



}