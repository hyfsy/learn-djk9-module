/**
 * JPMS(Java Platform Module System)
 * <p>
 * java.base模块相当于继承机制的Object，不需要显示依赖
 * <p>
 * maven项目编译，maven-compiler-plugin的版本必须要在3.8.1及以上
 *
 * @author baB_hyf
 * @date 2021/04/11
 */
module learn.jdk9.parent {

    requires transitive static learn.jdk9.child;

    // exports com.hyf.jdk9.parent;
    exports com.hyf.jdk9.parent to learn.jdk9.child, java.base;

    opens com.hyf.jdk9.parent;
    provides com.hyf.jdk9.child.service.IService with com.hyf.jdk9.parent.service.impl.ServiceImpl;

    // requires: 引入其他模块的所有暴露内容
    // exports: 暴露指定包的内容，只能选择包（不包含子包）
    // exports...to...: 表示暴露内容到指定模块，多个逗号分割
    // opens: 编译时屏蔽，运行时可用（用到反射的情况下会这样定义）
    // uses: 模块解耦，指示该模块会使用该接口实现，但具体实现由子模块提供
    // provides...with...: 提供接口实现，通过当前模块中的实现类

    // transitive: 保证使用当前模块的用户也能使用该词修饰的模块内容（传递父模块引入的模块权限）
    // static: 表示编译时依赖，运行时则消失
}

// 参考: https://zhuanlan.zhihu.com/p/142697835
