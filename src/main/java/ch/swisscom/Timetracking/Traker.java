package ch.swisscom.Timetracking;

public class Traker {
	private long id;
	private String titel;
	private String description;
	private String link;

	public Traker(long id, String titel, String description, String link) {
		super();
		this.id = id;
		this.titel = titel;
		this.description = description;
		this.link = link;
	}


	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
