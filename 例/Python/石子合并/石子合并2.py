'''
84石子合并<2>
时间限制：1秒        内存限制：128M
题目描述
在一个圆形操场的四周摆放N堆石子,现要将石子有次序地合并成一堆.规定每次只能选相邻的2堆合并成新的一堆，并将新的一堆的石子数，记为该次合并的得分。

试设计出1个算法,计算出将N堆石子合并成1堆的最小得分和最大得分。

输入描述
数据的第1行是正整数N，1≤N≤100，表示有N堆石子；

第2行有N个数，分别表示每堆石子的个数。

输出描述
输出共2行,，第1行为最小得分，第2行为最大得分。

样例
输入
4
4 4 5 9
8
4 4 5 9 4 5 9 4
输出
43
54

Version: 0.1
Author: CongHS
Date: 2021-09-06
'''
import numpy as np
N=0x3f3f3f3f
class Merge(object):
    @staticmethod
    def show():
        # 石子堆数
        sN = input()
        iNum = int(sN)
        # 每堆石子数
        stocks = input().split()

        # 算出石子总数
        sum = np.zeros(iNum * 2 + 1, dtype=np.int32)
        for i in range(1, iNum + 1):
            sum[i + iNum] = int(stocks[i-1])
            sum[i] += sum[i - 1] + sum[i + iNum]

        for i in range(iNum + 1, iNum + iNum + 1):
            sum[i] += sum[i - 1]

        # 初始化用于存储最大和最小得分的二维矩阵
        f = np.zeros([2 * iNum + 1, 2 * iNum + 1], dtype=np.int32)
        f1 = np.zeros([2 * iNum + 1, 2 * iNum + 1], dtype=np.int32)
        #f1*=N

        # 使用矩阵运算，求得最小和最大得分
        for len in range(2, iNum + 1):
            for i in range(1, 2 * iNum - len + 2):
                j = len + i - 1
                f1[i, j] = N
                for k in range(i, j):
                    f1[i, j] = min(f1[i,j], f1[i,k] + f1[k+1,j] + sum[j] - sum[i-1])
                    f[i,j] = max(f[i,j], f[i,k] + f[k+1, j] + sum[j]-sum[i-1])

        ans1 = N
        ans2 = 0
        for i in range(1, iNum + 1):
            ans1 = min(ans1, f1[i][i+iNum-1])
            ans2 = max(ans2, f[i][i+iNum-1])

        #输出
        print(ans1)
        print(ans2)

def main():
    mer = Merge()
    mer.show()


if __name__ == '__main__':
    main()
