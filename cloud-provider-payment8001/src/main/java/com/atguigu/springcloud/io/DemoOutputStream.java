package com.atguigu.springcloud.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/28 16:30
 */
public class DemoOutputStream {
    final static String text = "E://a.text";

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(text);
            byte[] bytes = "你好啊".getBytes();
            for (int i = 0; i < 10; i++) {
                fos.write(bytes);
            }

            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
