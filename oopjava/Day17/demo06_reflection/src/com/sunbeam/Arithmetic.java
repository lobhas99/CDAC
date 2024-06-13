package com.sunbeam;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-08 12:49
 */

public class Arithmetic implements Serializable {
	public Integer add(Integer a, Integer b) {
		return a + b;
	}
	private Integer multiply(Integer a, Integer b) {
		return a * b;
	}
	public Integer divide(Integer a, Integer b) {
		return a / b;
	}
}
