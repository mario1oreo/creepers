package com.fosun.fc.projects.creepers.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.fosun.fc.projects.creepers.service.ICreepersExceptionHandleService;
import com.fosun.fc.projects.creepers.service.ICreepersTaskListService;

public class CreepersBaseServiceImpl {

    @Autowired
    protected ICreepersExceptionHandleService creepersExceptionHandleServiceImpl;
    
    @Autowired
    protected ICreepersTaskListService creepersTaskListServiceImpl;
}
