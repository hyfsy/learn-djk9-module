/**
 * @author baB_hyf
 * @date 2021/04/11
 */
module learn.jdk9.child {

    // 仅暴露controller包的内容，子包不会暴露
    exports com.hyf.jdk9.child.controller;

    exports com.hyf.jdk9.child.service;
    uses com.hyf.jdk9.child.service.IService;
}