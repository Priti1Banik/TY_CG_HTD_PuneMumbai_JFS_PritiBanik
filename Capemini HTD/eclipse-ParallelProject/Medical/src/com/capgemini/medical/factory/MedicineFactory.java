package com.capgemini.medical.factory;

import com.capgemini.medical.dao.MedicalDAO;
import com.capgemini.medical.dao.MedicalDAOImpl;

public class MedicineFactory {

		private MedicineFactory() {
			
		}
		
		public static MedicalDAO getInstance() {
			MedicalDAO dao = new MedicalDAOImpl();
			return dao;
		}
}

