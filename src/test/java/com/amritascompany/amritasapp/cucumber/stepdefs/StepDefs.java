package com.amritascompany.amritasapp.cucumber.stepdefs;

import com.amritascompany.amritasapp.HelloworldApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HelloworldApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
