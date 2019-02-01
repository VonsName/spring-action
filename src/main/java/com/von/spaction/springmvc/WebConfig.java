package com.von.spaction.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/27 19:04
 * EnableWebMvc:表示启用SpringMvc
 * ComponentScan:主要是开启扫描带有@Controller等类似注解的类,用于让Spring找到合适的控制器
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.von.spaction.springmvc")
public class WebConfig implements WebMvcConfigurer, ServletContextAware {

    @Autowired(required = false)
    private ServletContext servletContext;

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("message");
        return messageSource;
    }

    @Bean
    public MessageSource messageSource1() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("file:///usr/local/messages");
        messageSource.setCacheSeconds(20);
        return messageSource;
    }


    /**
     * Thymeleaf模板视图解析器
     *
     * @param engine
     * @return
     */
    @Bean
    public ViewResolver viewResolver1(SpringTemplateEngine engine) {
        ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
        thymeleafViewResolver.setTemplateEngine(engine);
        return thymeleafViewResolver;
    }

    /**
     * 模板引擎
     *
     * @param templateResolver
     * @return
     */
    @Bean(value = "tempEn")
    @Primary
    public TemplateEngine templateEngine(ServletContextTemplateResolver templateResolver) {
        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
        springTemplateEngine.setTemplateResolver(templateResolver);
        return springTemplateEngine;
    }

    /**
     * 模板解析器
     *
     * @return
     */
    @Bean
    public ServletContextTemplateResolver templateResolver() {
        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver(servletContext);
        templateResolver.setPrefix("classpath:/thy/");
        templateResolver.setSuffix(".html");
        templateResolver.setCacheable(false);
        templateResolver.setTemplateMode(TemplateMode.HTML);
        return templateResolver;
    }

    /**
     * jsp视图解析器
     *
     * @return
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("classpath:/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        //将视图解析为Jstl
//        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    /**
     * 配置对静态资源的处理
     * 表示对静态资源会转发到Servlet容器中默认的Servlet上
     *
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
}
