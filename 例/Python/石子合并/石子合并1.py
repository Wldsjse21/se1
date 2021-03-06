'''
83石子合并<1>
时间限制：1秒        内存限制：128M
题目描述
     有N堆石子排成一排(n<=100),现要将石子有次序地合并成一堆，规定每次只能选相邻的两堆合并成一堆，并将新的一堆的石子数，记为该次合并的得分，编一程序，输入为堆数n及每堆石子数(<=200)；

（1）选择一种合并石子的方案，使得做n-1次合并，得分的总和最少

（2）选择一种合并石子的方案，使得做n-1次合并，得分的总和最多

输入描述
第一行为石子堆数n
第二行为每堆石子数，每两个数之间用一空格分隔。

输出描述
第一行为合并得分的最小值

第二行为合并得分的最大值

样例
输入
4
4 5 9 4
输出
44
54

输入
6
4
5
9
4
3
7
输出
80

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
        stocks = np.array(np.arange(iNum).reshape(iNum,1))
        for i in range(0, iNum) :
            stocks[i] = int(input())

        # 算出石子总数
        sum = np.zeros(iNum +1, dtype=np.int32)
        for i in range(1, iNum + 1):
            sum[i] = sum[i-1] + int(stocks[i-1])

        # 初始化用于存储最大和最小得分的二维矩阵
        f = np.zeros([iNum + 1, iNum + 1], dtype=np.int32)
        f1 = np.zeros([iNum + 1, iNum + 1], dtype=np.int32)
        #f1*=N

        # 使用矩阵运算，求得最小和最大得分
        for len in range(2, iNum + 1):
            for i in range(1, iNum - len + 2):
                j = len + i - 1
                f1[i, j] = N
                for k in range(i, j):
                    f1[i, j] = min(f1[i,j], f1[i,k] + f1[k+1,j] + sum[j] - sum[i-1])
                    f[i,j] = max(f[i,j], f[i,k] + f[k+1, j] + sum[j]-sum[i-1])

        #输出
        print(f1[1,iNum])

def main():
    mer = Merge()
    mer.show()


if __name__ == '__main__':
    main()
