plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)// jetbrains🔥
    alias(libs.plugins.kotlinCocoapods).apply(false)// jetbrains🔥
    alias(libs.plugins.compose.compiler).apply(false)// jetbrains🔥
    alias(libs.plugins.jetbrainsCompose) apply false// jetbrains🔥


}
