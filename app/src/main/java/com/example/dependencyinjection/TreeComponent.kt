package com.example.dependencyinjection

import dagger.Component

@Component(modules = [BranchModule::class])
interface TreeComponent {
    fun getTree():Tree
    fun getBranch():Branch
    fun getFruits():Fruits
    fun getLeaves():Leaves

}