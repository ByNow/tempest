package cn.bynow.tempest.web.base.config;

import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

import java.util.HashMap;


public class BeetlExtraConfig extends BeetlGroupUtilConfiguration {
    @Override
    public void initOther() {
        groupTemplate.registerFunctionPackage("shiro", new HashMap());
    }
}
