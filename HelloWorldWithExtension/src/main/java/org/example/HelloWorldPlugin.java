package org.example;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class HelloWorldPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project)
    {
        project.getExtensions().create("extension", HelloWorldExtension.class);
        project.getTasks().create("hello", HelloWorldTask.class);
    }
}
