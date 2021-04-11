package com.hyf.jdk9.parent.service.impl;

import com.hyf.jdk9.child.service.IService;

/**
 * @author baB_hyf
 * @date 2021/04/11
 */
public class ServiceImpl implements IService {

    @Override
    public void invoke() {
        System.out.println("Invoke success!");
    }
}
