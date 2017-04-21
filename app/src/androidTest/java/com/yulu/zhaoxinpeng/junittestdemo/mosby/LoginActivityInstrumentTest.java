package com.yulu.zhaoxinpeng.junittestdemo.mosby;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.yulu.zhaoxinpeng.junittestdemo.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressBack;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Administrator on 2017/4/20.
 */
@RunWith(AndroidJUnit4.class) // 1. 需要指定一下运行的环境@RunWith(AndroidJUnit4.class)
public class LoginActivityInstrumentTest {
    /**
     * 1. 需要指定一下运行的环境@RunWith(AndroidJUnit4.class)
     * 2. 指定一下启动测试的Activity
     * 3. 完善测试方法
     */

    // 2. 指定启动测试的Activity
    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<LoginActivity>(LoginActivity.class);

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void onCreate() throws Exception {
        onView(withId(R.id.login_username)).perform(typeText("123123"));

        Thread.sleep(1500);



        onView(withId(R.id.login_btn)).perform(typeText("123123"));

        Thread.sleep(1500);

        // TODO: 2017/4/21 测试登录界面，待完成
    }

    @Test
    public void onViewClicked() throws Exception {

        onView(withId(R.id.login_btn)).perform(click());
    }

}