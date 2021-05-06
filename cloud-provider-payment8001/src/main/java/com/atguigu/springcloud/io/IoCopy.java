package com.atguigu.springcloud.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/29 15:12
 */
public class IoCopy {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("E://桌面壁纸/324470.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream("D://test.jpg");
            byte[] bytes = new byte[1024];
            int read = 0;
            while ((read = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes);
//                System.out.println(new String(bytes));
            }
//            while ((read = fileInputStream.read()) != -1) {
//                fileOutputStream.write(read);
//            }
            fileOutputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
