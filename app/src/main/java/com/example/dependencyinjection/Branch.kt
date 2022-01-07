package com.example.dependencyinjection

import javax.inject.Inject


class Branch @Inject constructor(var leaves: Leaves,var fruits: Fruits) {


}