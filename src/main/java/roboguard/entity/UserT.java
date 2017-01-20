package roboguard.entity;

public class UserT {

	private int id;
	private String work_id;
	private String nickname;

	public UserT() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param value the id to set
	 */
	public UserT setId(final int value) {
		id = value;
		return this;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param value the nickname to set
	 */
	public UserT setNickname(final String value) {
		nickname = value;
		return this;
	}

	public String getWork_id() {
		return work_id;
	}

	public void setWork_id(String work_id) {
		this.work_id = work_id;
	}

}
