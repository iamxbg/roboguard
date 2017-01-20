package roboguard.entity;

import java.sql.Timestamp;

public class RecordT {

	private int id;
	private int v_id;
	private int u_id;
	private Timestamp log_ts;
	private boolean is_enter;

	public RecordT() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public Timestamp getLog_ts() {
		return log_ts;
	}

	public void setLog_ts(Timestamp log_ts) {
		this.log_ts = log_ts;
	}

	public boolean isIs_enter() {
		return is_enter;
	}

	public void setIs_enter(boolean is_enter) {
		this.is_enter = is_enter;
	}

	

}
