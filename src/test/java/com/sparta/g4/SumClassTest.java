package com.sparta.g4;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static org.testng.Assert.*;

public class SumClassTest {

    @Test
    @Parameters({"x", "y"})
    public void testSum(int xtttt, int y) {
        int res = xtttt+y;
        Assert.assertEquals(res, 5, "sum operation not working correct");

    }

    @Test
    @Parameters({"data"})
    //@TestId("ID123")
    public void testUsername(String fileName) throws IOException {
        DataClass dataClass = new ObjectMapper()
                .readValue(new File("/Users/artemmoroz/Projects/training/sparta/src/test/resources/"+fileName+".json"), DataClass.class);

        Assert.assertEquals(dataClass.getName(), "trusi2");
    }


    @BeforeMethod
    public void ss(){

    }

    @Test(dataProvider = "getSumData")
    public void sumTest(int x, int y, String message){
        assertEquals(x+y, 8, message);
    }

    @DataProvider
    public Object[][] getSumData() throws IOException {
        Object[][] data = new Object[3][3];
//        data[0][0] = 3;
//        data[0][1] = 5;
//        data[0][2] = "xxxx";
//        data[1][0] = 6;
//        data[1][1] = 23;
//        data[1][2] = "tttt";
//        data[2][0] = 6;
//        data[2][1] = 0;
//        data[2][2] = null;
        DataClass dataClass = new ObjectMapper()
                .readValue(new File("/Users/artemmoroz/Projects/training/sparta/src/test/resources/data.json"), DataClass.class);

        Object[][] data2 = new Object[dataClass.getCarList().size()][2];
        for(int i=0; i<dataClass.getCarList().size(); i++) {
            Car car = dataClass.getCarList().get(i);
            data2[i][0] = car.getColor();
            data2[i][1] = car.getModel();
        }

        return data;

    }


}