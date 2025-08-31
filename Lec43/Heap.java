package Lec43;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> ll = new ArrayList<Integer>();

	public void add(int item) {
		ll.add(item);
		upheapify(ll.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (ll.get(pi) > ll.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

	private void swap(int pi, int ci) {
		// TODO Auto-generated method stub
		int pith = ll.get(pi);
		int cith = ll.get(ci);
		ll.set(ci, pith);
		ll.set(pi, cith);
	}

	public int remove() {
		swap(0, ll.size() - 1);
		int val = ll.remove(ll.size() - 1);
		downheapify(0);
		return val;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < ll.size() - 1 && ll.get(mini) > ll.get(lci)) {
			mini = lci;
		}
		if (rci < ll.size() - 1 && ll.get(mini) > ll.get(rci)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}
	}

	public int get() {
		return ll.get(0);
	}

	public int size() {
		return ll.size();
	}

	public void Display() {
		System.out.println(ll);
	}

}
