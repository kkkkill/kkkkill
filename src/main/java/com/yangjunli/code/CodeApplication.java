/*
 * 所属工程:a-base-dashboard
 * 文件路径:/Users/junli.yang/Documents/workspace/a-base-dashboard/src/main/java/com/yangjunli/dashboard/DashboardApplication.java
 * 文件名称:DashboardApplication.java
 * 修改时间:2021-09-05 22:45:02
 * 代码作者:junli.yang
 * ©2021 - yangjunli.com
 */

package com.yangjunli.code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


/*
 * project: kylin_manager
 * module: kkkkill
 * @author junli.yang
 * for CodeApplication.java
 * lastModifyTime: 2023/3/1 下午3:32
 * Copyright (c) 2023.
 */

/**
 * @author junli.yang
 */
@SpringBootApplication
@EnableScheduling
@EnableAsync
@MapperScan(basePackages = {"com.yangjunli.kkkkill"})
public class CodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeApplication.class, args);
	}

}
