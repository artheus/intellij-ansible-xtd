package com.github.artheus.intellijansiblextd.services

import com.intellij.openapi.project.Project
import com.github.artheus.intellijansiblextd.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
