package com.github.baozidoufugan.translate.services

import com.intellij.openapi.project.Project
import com.github.baozidoufugan.translate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
