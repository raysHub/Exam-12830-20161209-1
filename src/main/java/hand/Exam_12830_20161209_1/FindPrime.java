package hand.Exam_12830_20161209_1;

import java.util.LinkedList;
import java.util.List;

public class FindPrime {
	
	public static void find(int start, int end){
		int count = 0;
		List<Integer> record = new LinkedList<Integer>();
		//外层循环从开始遍历到最后
		outer: for (int i = start; i <= end; i++) {
			//内层从2遍历到自身-1
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					//如果能被某个数整除，继续外层循环的下一次
					//continue只能跳出一层循环，所以使用一个标志，调到外层循环去
					continue outer;
				}
			}
			count++;
			record.add(i);
		}
		System.out.println(start + "-" + end + "之间总共有" + count + "个素数，分别是" + record);
	}

	public static void main(String[] args) {
		find(101, 200);
	}

}
