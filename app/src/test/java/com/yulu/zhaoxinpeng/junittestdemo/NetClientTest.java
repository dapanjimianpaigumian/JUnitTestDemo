package com.yulu.zhaoxinpeng.junittestdemo;

import com.google.gson.Gson;
import com.yulu.zhaoxinpeng.junittestdemo.model.NetClient;
import com.yulu.zhaoxinpeng.junittestdemo.model.UserResult;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import okhttp3.Call;
import okhttp3.Response;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Administrator on 2017/4/20.
 * EasyShopClient的测试类
 * 确定你要测试类或方法
 * 1. 创建测试类：GO TO --> Test
 * 2. 完善测试方法
 * 3. 运行测试
 */
public class NetClientTest {
    /**
     * @BeforeClass：只会执行一次的静态方法：数据库连接等
     * @Before：测试方法之前都会执行，作用：实现一些初始化的功能
     * @Test：要测试的方法
     * @After：测试方法之后都会执行，作用：资源释放、对象置空等
     * @AfterClass：只会执行一次的静态方法：数据库断开连接等
     * 执行顺序为：@BeforeClass --> @Before --> @Test --> @After --> @AfterClass
     *
     * 断言方法：断言类提供的一些方法，作用：验证测试的内容
     * 如果不能直接调出来：Assert.assertEquals();
     */
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    //测试登录模块
    @Test
    public void login() throws Exception {
        Call login = NetClient.getInstance().Login("123123", "123123");
        Response execute = login.execute();
        assertNotNull(execute);
    }

    //测试注册模块
    @Test
    public void registe() throws Exception {
        // 完善测试方法
        Call call = NetClient.getInstance().Registe("123123", "123123");
        Response response = call.execute();
        String json = response.body().string();
        UserResult userResult = new Gson().fromJson(json, UserResult.class);
        assertEquals(2,userResult.getCode());
    }

}