package com.wlse.lizi.hebing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

// 讲解的基础例子
// 包涵封装输入输出（使用系统的输入输出，可以方便地替换成使用文件作为输入输出），测试驱动的演示。

public class ShiZiHeBing {
	public void jieti(BufferedReader in, BufferedWriter out) throws IOException {
		// 输入
		final int Num = 10;
		long a[] = new long[Num];		
		int s = Integer.parseInt(in.readLine());
		int n = s;
		for(int i=1;i<=n;i++)
			a[i] = Integer.parseInt(in.readLine());

		// 运算
		Long ans = Long.parseLong("0");
		int pro,now=1;

		while(now<n-1)
		{
			for(pro=now;pro<n-1;pro++)
			{
				if(a[pro+2]<a[pro]) continue;
				a[pro+1]+=a[pro];
				ans+=a[pro+1];
				int k;
				for(k=pro;k>now;k--) a[k]=a[k-1]; 
				now++; k=pro+1;
				while(now<k&&a[k-1]<a[k])
				{
					a[k]^=a[k-1];
					a[k-1]^=a[k];
					a[k]^=a[k-1];
					k--;
				}
				break;
			}
			if(pro==n-1) {a[n-1]+=a[n];ans+=a[n-1];n--;}
		}
		if(now==n-1) ans+=(a[n-1]+a[n]); 

		// 输出
		out.write(ans.toString());
	}

	public Integer add(int i, int j) {
		return i + j;
	}

}
