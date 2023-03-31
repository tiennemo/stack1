package basic.dev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// bai 2
		Stack<Integer> s = new Stack<>();
		System.out.println();
		System.out.println("nhap vao vi tri phan tu muon in va xoa");
		int n = sc.nextInt();
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		s.push(25);
		// a
		int sSoPhanTu = s.size();
		System.out.println("So phan tu cua stack la " + sSoPhanTu);
		// b
		if (n <= s.size()) {
			int print = s.get(n - 1);
			System.out.println("Noi dung cua phan tu n la " + print);
		}
		// c
		System.out.print("Stack s: ");
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}
		// d
		System.out.println();
		s.remove(n - 1);
		System.out.print("Stack s sau khi xoa phan tu n: ");
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}

		// bai 3
		System.out.println();
		System.out.println("----------");
		Queue<Integer> a = new LinkedList<>();
		System.out.println("nhap vao vi tri phan tu muon in va xoa");
		int m = sc.nextInt();
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);
		// a
		int qSoPhanTu = a.size();
		System.out.println("So phan tu cua Queue la " + qSoPhanTu);
		// b
		int answer = 0;
		for (Integer b : a) {
			answer++;
			if (answer == m) {
				System.out.println("Noi dung cua phan tu thu n la: " + b);
			}

		}
		// c
		System.out.print("Queue a: ");
		for (Integer b : a) {
			System.out.print(b + " ");
		}
		// d
		System.out.println();
		a.remove(m - 1);
		System.out.print("Queue a sau khi xoa phan tu m: ");
		for (Integer b : a) {
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("-----------");
		// bai 4: Dao nguoc Stack
		Stack<Integer> s1 = new Stack<>();
		while (s.size() > 0) {
			s1.push(s.pop());
		}
		System.out.print("Stack s sau khi dao nguoc ");
		for (Integer s2 : s1) {
			System.out.print(s2 + " ");
		}
		// bai 5: Dao nguoc Queue
		Stack<Integer> as = new Stack<>();
		Queue<Integer> a1 = new LinkedList<>();

		while (a.size() > 0) {
			as.push(a.remove());
		}
		while (as.size() > 0) {
			a1.add(as.pop());
		}
		System.out.println();
		System.out.print("Queue a sau khi dao nguoc ");
		for (Integer a2 : a1) {
			System.out.print(a2 + " ");
		}
	}

}