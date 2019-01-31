package com.von.spaction.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;
import java.util.List;
import java.util.Map;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/27 21:29
 */
@Controller
@RequestMapping(value = "spittles")
public class SpittleController {

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    /**
     * Model:这里的Model相当于一个Map,key-value类型,
     * 也可以使用java.util.map来代替
     *
     * @param model
     * @return
     */
//    @RequestMapping(method = RequestMethod.GET)
//    public String spittle(Map<String, Object> model) {
////        model.addAttribute("spitleList",spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//        model.put("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//        return "spittles";
//    }

    /**
     * 如果没有像上面的方法一样使用Model指定返回渲染的视图以及返回的数据
     * SpringMvc会自动将数据放入到模型中
     * 模型的key会根据类型推导得出:这里就是spittleList
     * 而逻辑视图名将会根据请求路径推导得出,这里请求路径是 spittles
     * 所以返回的视图名称就是:spittles
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittle() {
        return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
    }

    public static void main(String[] args) {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.initialize();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setDaemon(false);
        taskExecutor.execute(new MapTest());

        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        Part part;
//        MultipartFile
    }
}
