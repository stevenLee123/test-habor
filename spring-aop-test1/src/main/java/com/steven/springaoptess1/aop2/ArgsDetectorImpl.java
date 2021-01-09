package com.steven.springaoptess1.aop2;

public class ArgsDetectorImpl implements ArgsDetector {
    @Override
    public boolean validate(String args) {
        System.out.println("引入新接口测试proxy的多接口代理："+this.getClass().getSimpleName());
        return !(args == null || args.trim().equals(""));
    }
}
