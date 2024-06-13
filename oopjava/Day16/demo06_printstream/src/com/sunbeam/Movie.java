package com.sunbeam;

import java.io.Serializable;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07 14:08
 */

public class Movie implements Serializable {
	//private static final long serialVersionUID = 4L;
	private int id;
	private float rating;
	private String title;
	public Movie() {
	}
	public Movie(int id, float rating, String title) {
		this.id = id;
		this.rating = rating;
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", rating=" + rating + ", title=" + title + "]";
	}
}
