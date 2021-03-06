package HW_14052021.Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JavaToJSON {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Staff staff = createStaff();
        try {
            mapper.writeValue(new File("D:\\staff.json"), staff);
            String jsonString = mapper.writeValueAsString(staff);
            System.out.println(jsonString);
            String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
            System.out.println(jsonInString2);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Staff createStaff() {
        Staff staff = new Staff();
        staff.setName("mkyong");
        staff.setAge(38);
        staff.setPosition(new String[]{"Founder", "CTO", "Writer"});
        Map<String, BigDecimal> salary = new HashMap() {{
            put("2010", new BigDecimal(10000));
            put("2012", new BigDecimal(12000));
            put("2018", new BigDecimal(14000));
        }};
        staff.setSalary(salary);
        staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));
        return staff;
    }
}
