package com.cinema.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Booking{
	@Id
	private Integer bookingId;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users user;
	@ManyToOne
	@JoinColumn(name = "show_id")
	private Shows shows;
	private Date bookedDate;
	private Date showDate;

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Shows getShows() {
		return shows;
	}

	public void setShows(Shows shows) {
		this.shows = shows;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	@OneToMany(mappedBy = "booking", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<BookingDetails> bookingDetails;

}
