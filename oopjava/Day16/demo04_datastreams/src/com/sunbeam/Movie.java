package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07 12:21
 */

public class Movie {
	private int id;
	private double rating;
	private String title;
	public Movie() {
	}
	public Movie(int id, double rating, String title) {
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
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
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
