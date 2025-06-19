import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)// jetbrains🔥
    alias(libs.plugins.jetbrainsCompose)// jetbrains🔥
    alias(libs.plugins.compose.compiler)// jetbrains🔥
    alias(libs.plugins.kotlinCocoapods)// jetbrains🔥
    alias(libs.plugins.androidLibrary)
}

kotlin {
    androidTarget {
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions {
                    jvmTarget.set(JvmTarget.JVM_1_8)
                }
            }
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "16.0"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
            api(compose.material3) // md 设计的组件
            api(compose.foundation) // 基础布局组件
            api(compose.ui) // 测量、布局、绘制、事件、Modifier
            api(compose.runtime) // 树管理能力
            api(compose.animation) // 动画
            api(libs.precompose)  // 跨平台导航库
            implementation(libs.precompose.viewmodel)   // ViewModel
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.lyf.cmpapp"
    compileSdk = 35
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}