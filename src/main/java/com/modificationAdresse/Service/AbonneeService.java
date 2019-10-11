package com.modificationAdresse.Service;
import java.util.ArrayList;
import java.util.List;

import com.modificationAdresse.Repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modificationAdresse.model.*;

@Service
public class AbonneeService {

	 @Autowired
	 AbonneeRepository abonneeRep;
	 
	 public List<Abonnee> getAllAbonnee()
	    {
	        List<Abonnee> abonneeList = (List<Abonnee>) abonneeRep.findAll();
	         
	        if(abonneeList.size() > 0) {
	            return abonneeList;
	        } else {
	            return new ArrayList<Abonnee>();
	        }
	    }
}
