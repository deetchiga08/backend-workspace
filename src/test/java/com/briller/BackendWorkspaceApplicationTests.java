package com.briller;

import org.junit.Test;
import com.briller.Controller.testController;
import com.briller.Model.general;
import com.briller.Repository.generalRepository;
import org.junit.runner.RunWith;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.WebApplicationContextRunner;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BackendWorkspaceApplicationTests {

    @MockBean
    private generalRepository GeneralRepository;

    @Autowired
    private testController testController;

    @Test
    public void getdataTest()
    {

        when(GeneralRepository.findAll()).thenReturn(Stream.of(new general(1,"deetchiga"),new general(2,"kkkk")).collect(Collectors.toList()));
        assertEquals(2,testController.getdata().size());
    }


}
