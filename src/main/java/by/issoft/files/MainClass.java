package by.issoft.files;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

@Data
@Accessors(chain = true)
public class MainClass {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/user.json");
        //Path path = Paths.get("src/main/resources/user.csv");
        String fileContent = new String(Files.readAllBytes(path));
//        List<String> listLInes = Files.readAllLines(path);
//        for(String line: listLInes){
//            String[] cols = line.split(",");
//            System.out.println(cols[0] + "-- "+ cols[3]);
//        }

        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(fileContent, User.class);

        System.out.println(user.username);
        System.out.println(user.kids);

//        user.setUsername("testUser");
//        String newUserString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
//        System.out.println(newUserString);

//        RequestSpecification given = given();
//        Response getReq = given.get("sadas");
//        String s = getReq.asString();

        ServiceResult result =
                given().get("http://dummy.restapiexample.com/api/v1/employees")
                        .as(ServiceResult.class);

        System.out.println(result.getData().size());

        for(Employee employee: result.getData()){
            if(employee.getEmployee_salary().length()<6){
                System.out.println(employee.getEmployee_name());

            }
        }


    }
}
