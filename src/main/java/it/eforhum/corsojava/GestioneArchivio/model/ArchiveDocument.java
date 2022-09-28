package it.eforhum.corsojava.GestioneArchivio.model;

public class ArchiveDocument {
	private int id;
	private String cod;
	private String description;

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {

		// se description > 30 .substrim ultimi 3 char con ...

		if (description == null) {
			description = "";
		}
		description = description.trim();
		if(description.length() > 30) {
			description = description.substring(0, 27).concat("...");
		}
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public ArchiveDocument(String cod, String description) {
		this.setCod(cod);
		this.setDescription(description);
	}

}
