package com.appsdeveloper.hr.cucumber;

import com.appsdeveloper.hr.JhipsterHrApplicationApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JhipsterHrApplicationApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
