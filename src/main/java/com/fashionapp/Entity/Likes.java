package com.fashionapp.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "likes")
public class Likes implements Serializable{
 
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private long userId;

	private long videoId;

	@Column(columnDefinition = "tinyint(1) default 0")
	private boolean liked;

	@Column(columnDefinition = "tinyint(1) default 0")
	private boolean disLiked;
	
	@Column(name="time")
	private Date date;
	
	@PrePersist
	protected void onCreate() {
		date = new Date();
	}

	public Likes() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getVideoId() {
		return videoId;
	}

	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

	public boolean isLiked() {
		return liked;
	}

	public void setLiked(boolean liked) {
		this.liked = liked;
	}

	public boolean isDisLiked() {
		return disLiked;
	}

	public void setDisLiked(boolean disLiked) {
		this.disLiked = disLiked;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * 
	 * @param userId
	 * @param videoId
	 * @param liked
	 * @param disLiked
	 */
	public Likes(Long userId, Long videoId, boolean liked, boolean disLiked) {
		this.userId = userId;
		this.videoId = videoId;
		this.liked = liked;
		this.disLiked = disLiked;
	}
}
