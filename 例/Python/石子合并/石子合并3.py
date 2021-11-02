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
MAX_NUM=0x7fffffff
class Merge(object):
    @staticmethod
    def show():
        # 石子堆数
        n = int(input())

        N = 12
        v = np.array(np.arange(N).reshape(N,1))

        v[N-1] = 0
        v[0] = MAX_NUM
        v[n + 1] = MAX_NUM
        # 每堆石子数
        for i in range(1, n + 1) :
            v[i] = int(input())

        cnt = 0
        b = np.array(np.arange(N * N).reshape(N,N))
        b *= 0
        while n > 1:
            n -= 1

            for c in range(1, n+2):
                b[cnt,c] = v[c]
            b[cnt, N - 1] = v[len(v) - 1]
            cnt += 1

            for k in range(1, (n + 1) + 1):
                if v[k - 1] < v[k + 1]:
                    break
            sum = v[k] + v[k - 1]
            for j in range(k - 1, -1, -1):
                if v[j] > v[k] + v[k - 1]:
                    break
            v = np.delete(v, k - 1, 0)
            v = np.delete(v, k - 1, 0)
            v = np.insert(v, j + 1, sum, 0)

            v[len(v) - 1] += sum[0]

        for c in range(1, n + 2):
            b[cnt, c] = v[c]
        b[cnt, N - 1] = v[len(v) - 1]
        cnt += 1

        #输出
        print(v[len(v) - 1])

def main():
    mer = Merge()
    mer.show()


if __name__ == '__main__':
    main()
