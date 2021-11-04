import numpy as np
MAX_NUM=0x7fffffff
class Merge(object):
    @staticmethod
    def show():
        # 石子堆数
        n = int(input())

        N = 41000
        v = np.array(np.arange(N).reshape(N,1))

        ans = 0
        v[0] = MAX_NUM
        v[n + 1] = MAX_NUM
        # 每堆石子数
        for i in range(1, n + 1) :
            v[i] = int(input())

        while n > 1:
            n -= 1
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

            ans += sum

        #输出
        print(ans[0])

def main():
    mer = Merge()
    mer.show()


if __name__ == '__main__':
    main()