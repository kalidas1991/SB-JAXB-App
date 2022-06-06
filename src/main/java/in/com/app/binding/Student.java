package in.com.app.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private int id;
	private String name;
	private long rank;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRank(long rank) {
		this.rank = rank;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getRank() {
		return rank;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
}
