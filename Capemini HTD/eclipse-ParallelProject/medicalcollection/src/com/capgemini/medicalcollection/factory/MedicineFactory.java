package com.capgemini.medicalcollection.factory;

import com.capgemini.medicalcollection.dao.DAOImpl;
import com.capgemini.medicalcollection.dao.MedicineDAO;

public class MedicineFactory {

		private MedicineFactory() {
			
		}
		
		public static MedicineDAO getInstance() {
			MedicineDAO dao = new DAOImpl();
			return dao;
		}
}

