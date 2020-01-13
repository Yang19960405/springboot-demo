package com.example.demo.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.logging.LoggerFactory;
import org.mybatis.logging.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class MyBatisPlusConfig {
    //日志记录
    private final static Logger logger = LoggerFactory.getLogger(MyBatisPlusConfig.class);

    /**
     * @description: 配置分页插件
     * @author: gradual
     * @date: 2019/1/15 10:17
     * @param: []
     * @return: com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        logger.debug("注册分页插件");
//        return new PaginationInterceptor();
//    }
//
//    /**
//     * @description: SQL执行效率插件
//     * @author: gradual
//     * @date: 19-1-24 下午4:59
//     * @param: []
//     * @return: com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor
//     */
//    @Bean
//    @Profile({"test"})// 设置 dev test 环境开启
//    public PerformanceInterceptor performanceInterceptor() {
//        return new PerformanceInterceptor();
//    }
//
//    /**
//     * 逻辑删除用，3.1.1之后的版本可不需要配置该bean，但项目这里用的是3.1.0的
//     *
//     * @return com.baomidou.mybatisplus.core.injector.ISqlInjector
//     * @author David Hong
//     */
//    @Bean
//    public ISqlInjector sqlInjector() {
//        return new LogicSqlInjector();
//    }
}
