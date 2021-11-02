'''
石子合并<3>
时间限制：1秒        内存限制：128M
题目描述
     有N堆石子排成一排(n<=40000),现要将石子有次序地合并成一堆，规定每次只能选相邻的两堆合并成一堆，并将新的一堆的石子数，记为该次合并的得分，编一程序，输入为堆数n及每堆石子数(<=200)；

选择一种合并石子的方案，使得做n-1次合并，得分的总和最少

输入描述
第一行为石子堆数n
接下来 NN 行，第 ii 行一个整数 a_ia ，代表第 ii 堆石子的石子数。

输出描述
合并得分的最小值


样例
输入
5
186
64
35
32
103

输出
852

9
1
2
3
4
5
6
7
8
9

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

        N = 41000
        a = np.zeros([N], dtype=np.int64)
        ans = 0
        # 每堆石子数
        for i in range(1, iNum + 1) :
            a[i] = int(input())

        n = iNum
        ans = 0
        now = 1
        pro = 0
        while (now < n - 1) :
            for pro in range(now, n) :
                if (a[pro + 2] < a[pro]) :
                    continue
                a[pro + 1] += a[pro]
                ans += a[pro + 1]
                k = 0
                for k in range(pro, now, -1) :
                    a[k] = a[k-1]

                now += 1
                k = pro + 1
                while (now < k and a[k - 1] < a[k]):
                    a[k] ^= a[k-1]
                    a[k-1] ^= a[k]
                    a[k] ^= a[k-1]
                    k -= 1
                break

            if (pro == n - 1) :
                a[n-1] += a[n]
                ans += a[n-1]
                n -= 1

        if (now == n-1) :
            ans += (a[n-1]+a[n])


        #输出
        print(ans)

def main():
    mer = Merge()
    mer.show()


if __name__ == '__main__':
    main()
