package ch.swisscom.Timetracking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

@Entity
public class Traker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotBlank(message = "title is mandatory")
	private String titel;
	@NotBlank(message = "description is mandatory")
	private String description;
	@NotBlank(message = "link is mandatory")
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
