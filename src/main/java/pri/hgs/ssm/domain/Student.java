package pri.hgs.ssm.domain;

import java.util.List;

public class Student {
    private int stid;
    private String name;
    private String password;
    private int gender;
    private String grate;
    private List<Score> scores;// Ò»¶Ô¶à
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getGrate() {
		return grate;
	}
	public void setGrate(String grate) {
		this.grate = grate;
	}
	public List<Score> getScores() {
		return scores;
	}
	public void setScores(List<Score> scores) {
		this.scores = scores;
	}
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", name=" + name + ", password=" + password + ", gender=" + gender + ", grate="
				+ grate + "]";
	}
    
}
