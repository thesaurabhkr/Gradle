package org.example;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class HelloWorldTask extends DefaultTask {
    @TaskAction
    public void print()
    {
        HelloWorldExtension extension = getProject().getExtensions().findByType(HelloWorldExtension.class);

        System.out.println("Hello " + extension.getName() + "!");
    }
}
