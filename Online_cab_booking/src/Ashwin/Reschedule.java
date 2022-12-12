package Ashwin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reschedule {
	static SimpleDateFormat d12 = new SimpleDateFormat("yyyy-MM-dd");
	static SimpleDateFormat d2 = new SimpleDateFormat("hh:mm aa");
	private Date rescheduleday;
	private Date rescheduleDateTo;
	private String reShift;

	Reschedule() {

	}

	Reschedule(Date rescheduleday, Date rescheduleDateTo) {
		this.rescheduleday = rescheduleday;
		this.rescheduleDateTo = rescheduleDateTo;
	}

	public String getReShift() {
		return reShift;
	}

	public void setReShift(String reShift) {
		this.reShift = reShift;
	}

	public Date getRescheduleday() {
		return rescheduleday;
	}

	public Date getRescheduleDateTo() {
		return rescheduleDateTo;

	}

	public String updateQuery() {
		return "" + d12.format(rescheduleday) + "," + d12.format(rescheduleDateTo) + "";
	}

//	public void setRescheduleday(Date rescheduleday) {
//		this.rescheduleday = rescheduleday;
//	}
//	public void setRescheduleDateTo(Date rescheduleDateTo) {
//		this.rescheduleDateTo = rescheduleDateTo;
//	}
}
