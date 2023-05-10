package com.bridgelabz.indian;


	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	public class StateCensusAnalyser {

	    public static void main(String[] args) throws StateSensorAnylaysisException, IOException {
	        String filePathRead = "E:\\StateCensusData.csv";
	        String fileName = "StateCensusData";
	        String delimiter =",";
	        List<String> stringName = new ArrayList<>();
	        stringName.add("State");
	        stringName.add("Population");
	        stringName.add("AreaInSqKm");
	        stringName.add("DensityPerSqKm");

	        ReadOperation readObj = new ReadOperation();
	        int count = readObj.readDataCount(filePathRead, fileName);
	        System.out.println(count);

	        readObj.readDelimiter(filePathRead, delimiter);
	        readObj.readHeader(filePathRead, stringName);
	    }
	}
