package com.group2.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MBy extends By{

    List<By> selectors;

    public MBy() {
        selectors = new LinkedList<>();
    }

    public MBy(List<By> selectors) {
        this.selectors = selectors;
    }

    @Override
    public List<WebElement> findElements(SearchContext context) {
        for(By by:selectors){
            try {
                List<WebElement> elements = context.findElements(by);
                if (elements != null && elements.isEmpty()) {
                    return elements;
                }
            }catch (Exception ex){
                //ignore that
            }
        }
        throw new WebDriverException("Could not find elements via selectors "+this.toString());
    }

    @Override
    public WebElement findElement(SearchContext context) {
        for(By by:selectors){
            try {
                WebElement element = context.findElement(by);
                if (element != null) {
                    return element;
                }else{
                    System.out.println("Invalid "+by);
                }
            }catch (Exception ex){
                System.out.println("Invalid11 "+by);
                //ignore that
            }
        }
        throw new WebDriverException("Could not find element via selectors "+this.toString());
    }

    public MBy add(By by){
        selectors.add(by);
        return this;
    }

    public static MBy build(By...by){
        MBy mBy = new MBy(Arrays.asList(by));
        return mBy;
    }

    public static MBy css(String...by){
        MBy mBy = new MBy();
        Arrays.stream(by).forEach(b->mBy.add(By.cssSelector(b)));
        return mBy;
    }

    public static MBy xpath(String...by){
        MBy mBy = new MBy();
        Arrays.stream(by).forEach(b->mBy.add(By.xpath(b)));
        return mBy;
    }

}