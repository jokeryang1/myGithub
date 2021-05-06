package com.atguigu.springcloud.io;

import java.io.*;

/**
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/28 16:30
 */
public class DemoFileInputStream {
    final static String text = "E://a.text";

    public static void main(String[] args) {
        FileInputStream fos = null;
        try {
            fos = new FileInputStream(text);
            byte[] bytes = new byte[1024];
//            Reader reader = new InputStreamReader(fos,"UTF-8");
            int read = 0;
            while ((read = fos.read(bytes)) != -1) {
                System.out.println(new String(bytes,0,bytes.length -1) );
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
