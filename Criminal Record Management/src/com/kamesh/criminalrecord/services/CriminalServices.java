package com.kamesh.criminalrecord.services;

import com.kamesh.criminalrecord.models.CriminalModel;

public interface CriminalServices {
	int registerCriminal(CriminalModel criminalModel) throws Exception;
}
