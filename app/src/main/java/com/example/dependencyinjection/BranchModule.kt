package com.example.dependencyinjection

import dagger.Module
import dagger.Provides

@Module
class BranchModule {

    @Provides
    fun provideLeaves():Leaves{
        return Leaves()
    }
    @Provides
    fun provideFruits():Fruits{
        return Fruits()
    }
    @Provides
    fun provideBranch():Branch{
        return Branch(Leaves(), Fruits())
    }

}