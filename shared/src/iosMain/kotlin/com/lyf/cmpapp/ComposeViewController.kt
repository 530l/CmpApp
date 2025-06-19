package com.lyf.cmpapp

// shared/src/iosMain/kotlin/com.lyf.cmpapp/ComposeViewController.kt

import androidx.compose.ui.window.ComposeUIViewController

//todo 注意，ComposeViewController 是包装给 ios app 用的，通过 share 的形式底层
//下面的代码就是在ios中 UIViewControllerRepresentable 的makeUIViewController
// 创建一个Controller，而这里就是调用ComposeViewControllerKt.AppViewController()
// 创建，桥接的方式
// 调用 Kotlin 中创建的 Compose UIViewController
//  ComposeViewControllerKt.AppViewController()
//todo 注意，ComposeViewController 是包装给 ios app 用的，通过 share 的形式底层


fun AppViewController() = ComposeUIViewController {
    HelloCmp(getPlatform().name)
}
