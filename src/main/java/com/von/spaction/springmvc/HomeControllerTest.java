package com.von.spaction.springmvc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/27 20:58
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = WebConfig.class)
public class HomeControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testHomePage() throws Exception {
        HomeController homeController = new HomeController();
//        assertEquals("home", homeController.home());
        MockMvc mockMvc = standaloneSetup(homeController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.view().name("home"));
    }

    @Test
    public void shouldShowRecentSpittles() throws Exception {
        List<Spittle> spittlelist = createSpittlelist(20);
        SpittleRepository mock = Mockito.mock(SpittleRepository.class);
        Mockito.when(mock.findSpittles(Long.MAX_VALUE, 20))
                .thenReturn(spittlelist);
        SpittleController spittleController = new SpittleController(mock);
        MockMvc build = standaloneSetup(spittleController)
                .setSingleView(new InternalResourceView("classpath:/views/spittles.jsp"))
                .build();
        build.perform(MockMvcRequestBuilders.get("/spittles"))
                .andExpect(MockMvcResultMatchers.view().name("spittles"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"));
    }

    private List<Spittle> createSpittlelist(int count) {
        List<Spittle> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new Spittle("Spittle-" + i, new Date()));
        }
        return list;
    }
}
