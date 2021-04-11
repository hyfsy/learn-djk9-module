package com.hyf.jdk9.parent;

import com.hyf.jdk9.child.controller.Controller;
import com.hyf.jdk9.child.service.IService;
import com.hyf.jdk9.parent.service.impl.ServiceImpl;

/**
 * @author baB_hyf
 * @date 2021/04/11
 */
public class ParentTest {

    public static void main(String[] args) {
        Controller controller = new Controller();

        IService service = new ServiceImpl();
    }
}
