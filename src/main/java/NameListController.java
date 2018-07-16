import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class NameListController {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
//        staticFileLocation("/public");

        ArrayList<String> names = new ArrayList<>();
        names.add("Bill");
        names.add("Bob");
        names.add("Hannah");
        names.add("Luna");
        NameList nameList = new NameList(names);



        get("/one", (req, res) -> {

            HashMap<String, Object> model = new HashMap<>();
            model.put("name", nameList.getRandomName());
            return new ModelAndView(model, "onename.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", nameList.getRandomPair());
            return new ModelAndView(model, "twoname.vtl");
        }, velocityTemplateEngine);




    }
}
