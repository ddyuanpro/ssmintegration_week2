package pri.hgs.ssm.domain;

public class Score {
    private int id;
    private int stid;
    private String course;
    private int score;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [id=" + id + ", stid=" + stid + ", course=" + course + ", score=" + score + "]";
	}
    
}
