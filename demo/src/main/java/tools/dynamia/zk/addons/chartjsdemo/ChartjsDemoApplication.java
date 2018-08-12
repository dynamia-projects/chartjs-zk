package tools.dynamia.zk.addons.chartjsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(exclude = GsonAutoConfiguration.class)
@Import(ZKCEConfig.class)
@Controller
public class ChartjsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChartjsDemoApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/xy")
    public String xy() {
        return "xy";
    }
}
