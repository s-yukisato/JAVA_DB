package db;

import java.sql.Date;
import java.sql.Time;

public class Appear {
	/** 番号 */
	private int id;
	/** 番号*/
	private int number;
	/** 名前 */
	private String name;
	/** 県名 */
	private String ken;
	/** 市名 */
	private String shi;
	/** 日付 */
	private Date date;
	/** 時刻 */
	private Time time;

	public Appear(int id, int number, String name, String ken, String shi, Date date, Time time) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.ken = ken;
		this.shi = shi;
		this.date = date;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKen() {
		return ken;
	}
	public void setKen(String ken) {
		this.ken = ken;
	}
	public String getShi() {
		return shi;
	}
	public void setShi(String shi) {
		this.shi = shi;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}

}