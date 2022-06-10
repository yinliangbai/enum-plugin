package com.github.yinliangbai.enumplugin.services

import com.intellij.openapi.project.Project
import com.github.yinliangbai.enumplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
