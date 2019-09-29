package com.kamesh.criminalrecord.models;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class CriminalModel {
	
	private String criminal_id;
	private String full_name;
	private long mobile;
	private String assigned_work;
	private String blood_group;
	private String crime_type; 
	
	private Date dob;
	
	private Time entered_time = new Time(new java.util.Date().getTime());
	private boolean dna = false;
	private boolean finger_prints = false;
	private boolean images = false;
	private boolean retina = false;
	
	private String health_condition;
	private String jail_name;
	private int cell_no; 
	private int punishment_duration;
	
	private Date meeting_date = null;
	private String meeting_person = "none"; 
	private Time meeting_time = null;
	
	public CriminalModel() {
	}

	public CriminalModel(String criminal_id, String full_name, long mobile, String assigned_work, String blood_group,
			String crime_type, Date dob, Time entered_time, boolean dna, boolean finger_prints, boolean images,
			boolean retina, String health_condition, String jail_name, int cell_no, int punishment_duration,
			Date meeting_date, String meeting_person, Time meeting_time) {
		
		super();
		
		this.criminal_id = criminal_id;
		this.full_name = full_name;
		this.mobile = mobile;
		this.assigned_work = assigned_work;
		this.blood_group = blood_group;
		this.crime_type = crime_type;
		this.dob = dob;
		this.entered_time = entered_time;
		this.dna = dna;
		this.finger_prints = finger_prints;
		this.images = images;
		this.retina = retina;
		this.health_condition = health_condition;
		this.jail_name = jail_name;
		this.cell_no = cell_no;
		this.punishment_duration = punishment_duration;
		this.meeting_date = meeting_date;
		this.meeting_person = meeting_person;
		this.meeting_time = meeting_time;
	}

	public String getCriminal_id() {
		return criminal_id;
	}

	public void setCriminal_id(String criminal_id) {
		this.criminal_id = criminal_id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAssigned_work() {
		return assigned_work;
	}

	public void setAssigned_work(String assigned_work) {
		this.assigned_work = assigned_work;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getCrime_type() {
		return crime_type;
	}

	public void setCrime_type(String crime_type) {
		this.crime_type = crime_type;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Time getentered_time() {
		return entered_time;
	}

	public void setentered_time(Time entered_time) {
		this.entered_time = entered_time;
	}

	public boolean isDna() {
		return dna;
	}

	public void setDna(boolean dna) {
		this.dna = dna;
	}

	public boolean isFinger_prints() {
		return finger_prints;
	}

	public void setFinger_prints(boolean finger_prints) {
		this.finger_prints = finger_prints;
	}

	public boolean isImages() {
		return images;
	}

	public void setImages(boolean images) {
		this.images = images;
	}

	public boolean isRetina() {
		return retina;
	}

	public void setRetina(boolean retina) {
		this.retina = retina;
	}

	public String getHealth_condition() {
		return health_condition;
	}

	public void setHealth_condition(String health_condition) {
		this.health_condition = health_condition;
	}

	public String getJail_name() {
		return jail_name;
	}

	public void setJail_name(String jail_name) {
		this.jail_name = jail_name;
	}

	public int getCell_no() {
		return cell_no;
	}

	public void setCell_no(int cell_no) {
		this.cell_no = cell_no;
	}

	public int getPunishment_duration() {
		return punishment_duration;
	}

	public void setPunishment_duration(int punishment_duration) {
		this.punishment_duration = punishment_duration;
	}

	public Date getMeeting_date() {
		return meeting_date;
	}

	public void setMeeting_date(Date meeting_date) {
		this.meeting_date = meeting_date;
	}

	public String getMeeting_person() {
		return meeting_person;
	}

	public void setMeeting_person(String meeting_person) {
		this.meeting_person = meeting_person;
	}

	public Time getMeeting_time() {
		return meeting_time;
	}

	public void setMeeting_time(Time meeting_time) {
		this.meeting_time = meeting_time;
	}
		
}
