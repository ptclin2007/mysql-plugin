package com.github.ptclin2007.mysqlplugin.services

import com.github.ptclin2007.mysqlplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
