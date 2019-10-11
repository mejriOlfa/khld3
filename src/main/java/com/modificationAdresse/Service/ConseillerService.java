package com.modificationAdresse.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modificationAdresse.model.Abonnee;
import com.modificationAdresse.model.Adresse;
import com.modificationAdresse.model.Contrat;

@Service
public class ConseillerService {
@Autowired
AdresseService adresseService;
	public void updateAdresse(Abonnee abonnee, Adresse adresse) {
		List <Adresse> listAdresse=abonnee.getAdresseList();
		for (Adresse ad:listAdresse){
			if ((ad.getPrincipale()==true) && (ad.getEtat().equals(Etat.ACTIVE))){
				adresseService.createOrUpdateAdresse(adresse);
				break;
			}
		}
		//modif adresse des contrat
		List <Contrat> listContrat=abonnee.getContraList();
		for (Contrat crt:listContrat){
			crt.setAdresse(adresse);		
		}	
	}

}
