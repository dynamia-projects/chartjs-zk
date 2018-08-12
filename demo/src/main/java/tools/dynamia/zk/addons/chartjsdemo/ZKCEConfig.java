package tools.dynamia.zk.addons.chartjsdemo;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.zkoss.zk.au.http.DHtmlUpdateServlet;
import org.zkoss.zk.ui.http.DHtmlLayoutServlet;
import org.zkoss.zk.ui.http.HttpSessionListener;

import java.util.HashMap;
import java.util.Map;

public class ZKCEConfig {


    @Bean
    public ViewResolver zulViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/zkau/web/zul/");
        resolver.setSuffix(".zul");
        resolver.setOrder(1);
        resolver.setCache(false);
        return resolver;
    }

    /*
     * ZK servlets
     */
    @Bean
    public ServletRegistrationBean dHtmlLayoutServlet() {
        Map<String, String> params = new HashMap<>();
        params.put("update-uri", "/zkau");
        DHtmlLayoutServlet dHtmlLayoutServlet = new DHtmlLayoutServlet();
        ServletRegistrationBean reg = new ServletRegistrationBean(dHtmlLayoutServlet, "*.zul", "*.zhtml");
        reg.setLoadOnStartup(1);
        reg.setInitParameters(params);
        return reg;
    }

    @Bean
    public ServletRegistrationBean dHtmlUpdateServlet() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("update-uri", "/zkau/*");
        ServletRegistrationBean reg = new ServletRegistrationBean(new DHtmlUpdateServlet(), "/zkau/*");
        reg.setLoadOnStartup(2);
        reg.setInitParameters(params);
        return reg;
    }

    @Bean
    public HttpSessionListener httpSessionListener() {
        return new HttpSessionListener();
    }

    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }


}