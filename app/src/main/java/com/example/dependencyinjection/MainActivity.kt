package com.example.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.internal.DaggerGenerated
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var tree: Tree
    @Inject
    lateinit var branch: Branch
    @Inject
    lateinit var leaves: Leaves
    @Inject
    lateinit var fruits: Fruits


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val treeComponent:TreeComponent=DaggerTreeComponent.create()
        tree=treeComponent.getTree()
        branch=treeComponent.getBranch()
        leaves=treeComponent.getLeaves()
        fruits=treeComponent.getFruits()


        tree.shake()
        tree.getTreeNumber()
        leaves.areLeavesFalling()
        fruits.getNoOfFruits()


    }
}