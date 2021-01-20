package de.tuberlin.sbe.prog1winf.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class NumberUtils {
	private List<Integer> myList;

	public double sum(List<? extends Number> numberList) {
//	public double sum(List<Number> numberList) {
		double sum = 0;
		for (Number n : numberList)
			sum += n.doubleValue();
		return sum;
	}
//	public double sum(Collection numberList) {
//		double sum = 0;
//		for (Object o : numberList) {
//			if (o instanceof Number) {
//				Number n = (Number) o;
//				sum += n.doubleValue();
//			} else {
//				// do nothing
//			}
//		}
//		return sum;
//	}

	public List addMyListEntries(List<? super Integer> inputList) {
		inputList.addAll(myList);
		return inputList;
	}

	public static void main(String[] args) {
		NumberUtils n = new NumberUtils();
		List<Double> l = new ArrayList<>();
//		List<Number> l = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			l.add(i*1.0);
//			l.add(i);
		}
		double sum = n.sum(l);
		System.out.println(sum);
	}
}
