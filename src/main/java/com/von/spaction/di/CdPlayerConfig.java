package com.von.spaction.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author vons0
 * Configuration:表示是一个JavaConfig配置类,相当于一个xml
 * ComponentScan:表示让Spring启用组件扫描,若没有显示配置basePackages,basePackageClasses或者其他
 * 默认扫描该配置类所在包以及该包下面的所有子包,
 * 会扫描带有@Component等注解的类
 * 相当于在xml中配置: <context:component-scan base-package="com.von"/>
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.von"})
public class CdPlayerConfig {
}
