
## 模块说明

### `androidApp/`
- Android 应用的壳工程，负责集成共享模块并提供 Android 特有的功能实现。

### `iosApp/`
- iOS 应用的壳工程，负责集成共享模块并提供 iOS 特有的功能实现。

### `shared/`
- 跨平台共享模块，用于存放业务逻辑、平台适配代码等。
  - `src/`：源码目录
    - `commonMain/`：通用业务逻辑，适用于所有平台
    - `androidMain/`：Android 平台专属代码
    - `iosMain/`：iOS 平台专属代码

### `build.gradle`
- 项目级构建配置文件，定义全局依赖和构建参数。
