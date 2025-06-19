CmpApp/  
 ├── androidApp/         # Android 壳工程
 ├── iosApp/             # iOS 壳工程
 ├── shared/             # 共享代码模块，目前仅包含业务逻辑，未来还会在此添加 UI 组件、资源等
 │   ├── src/  
 │   │   ├── commonMain/ # 共享逻辑  
 │   │   ├── androidMain/  # Android 平台代码  
 │   │   ├── iosMain/     # iOS 平台代码  
 └── build.gradle        # 项目级 build 文件
