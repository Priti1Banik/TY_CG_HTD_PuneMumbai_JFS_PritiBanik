package com.capgemini.medicalhibernate.factory;

import com.capgemini.medicalhibernate.dao.MedicalDAO;
import com.capgemini.medicalhibernate.dao.MedicalDAOImpl;

public class MedicineFactory {

		private MedicineFactory() {
			
		}
		
		public static MedicalDAO getInstance() {
		MedicalDAO dao = new MedicalDAOImpl();
			return dao;
		}
}

