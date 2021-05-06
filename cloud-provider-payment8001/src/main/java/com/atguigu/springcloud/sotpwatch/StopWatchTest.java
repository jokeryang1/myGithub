package com.atguigu.springcloud.sotpwatch;


import cn.hutool.core.date.StopWatch;

/**
 *
 * 程序耗时测试
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/27 14:26
 */
public class StopWatchTest {

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start("任务一：");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sw.stop();
        sw.start("任务二：");
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sw.stop();
        /*查询*/
        System.out.println("所有任务：" + sw.getTaskInfo().toString());
        for (StopWatch.TaskInfo info :
                sw.getTaskInfo()) {
            System.out.println(info.getTaskName() + ":" + info.getTimeMillis() +" ms");
        }
        /*全部打印,单位ns 纳秒， 1毫秒 = 1 000 000 纳秒*/
        System.out.println(sw.prettyPrint());

    }
}
