package com.github.n1ceaction.ideaarthus.services

import com.intellij.openapi.project.Project
import com.github.n1ceaction.ideaarthus.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
