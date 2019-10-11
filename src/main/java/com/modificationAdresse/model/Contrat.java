package com.modificationAdresse.model;

import java.util.Date;

public class Contrat {
	private Abonnee abonne;
	private Long numContrat;
	private Date dateCreation;
	private Adresse adresse;
	
	public Abonnee getAbonne() {
		return abonne;
	}
	public void setAbonne(Abonnee abonne) {
		this.abonne = abonne;
	}
	public Long getNumContrat() {
		return numContrat;
	}
	public void setNumContrat(Long numContrat) {
		this.numContrat = numContrat;
	}
	public Date getCreationDate() {
		return dateCreation;
	}
	public void setCreationDate(Date creationDate) {
		this.dateCreation = creationDate;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
