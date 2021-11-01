package com.wlse.jiang.jichu;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

// 建测试数据
// 可以通过产生随机数，建立多组数据。
// 初版可以直接写固定数字。

public class JianCeShiShuJu {
    public static void main(String[]arg) {
        try {
            BufferedWriter out = new BufferedWriter(
                new FileWriter("shulie.in"));

            // 把测试数据写入文件
            out.write(15 + " " + 28 + "\n"); 

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
