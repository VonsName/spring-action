package com.von.spaction.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

import java.io.IOException;

/**
 * @author ： fjl
 * @date ： 2019/1/28/028 17:11
 */
@Configuration
public class MultiPartConfig {

    /**
     * 标准上传文件解析器
     *
     * @return
     */
    @Bean
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }

    /**
     * Common文件上传解析器
     *
     * @return
     * @throws IOException
     */
    @Bean
    public MultipartResolver multipartResolver1() throws IOException {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        //这个属性设置为0表示所有文件上传都会写到磁盘中,而不会保存的内存中
        multipartResolver.setMaxInMemorySize(0);
        multipartResolver.setMaxUploadSize(Integer.MAX_VALUE);
        multipartResolver.setMaxUploadSizePerFile(Integer.MAX_VALUE);
        multipartResolver.setUploadTempDir(new FileSystemResource("/tmp/spitt"));
        return multipartResolver;
    }
}
