package org.example;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class HelloWorldTask extends DefaultTask{
    @TaskAction
    public void printThis()
    {
        System.out.println("Hello World!");
    }
}
