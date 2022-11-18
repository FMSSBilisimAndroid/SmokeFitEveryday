package SmokeFitEveryday.src.com.smokefiteveryday.apps.entity;

import java.util.List;

import SmokeFitEveryday.src.com.smokefiteveryday.apps.program.SportProgram;


public class SportInformation {

	private final int id;
	private final int userId;
	private final List<SportProgram> sportProgramList;

	public SportInformation(int id, int userId, List<SportProgram> sportProgramList) {
		super();
		this.id = id;
		this.userId = userId;
		this.sportProgramList = sportProgramList;
	}
	
	
	
}
