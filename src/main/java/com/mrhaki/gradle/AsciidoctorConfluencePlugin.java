package com.mrhaki.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class AsciidoctorConfluencePlugin implements Plugin<Project> {

    private Project project;

    @Override
    public void apply(final Project project) {
        this.project = project;
    }
    
}
