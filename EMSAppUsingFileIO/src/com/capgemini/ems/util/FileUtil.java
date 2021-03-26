package com.capgemini.ems.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.capgemini.ems.model.Employee;

public class FileUtil {
	
	private BufferedWriter bufferedWriter ;	
	private BufferedReader bufferedReader;
	
	
	public void openOutputFile() {
		try {
			bufferedWriter = new BufferedWriter(new FileWriter("employees.txt",true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void openInputFile() {
		try {
			bufferedReader = new BufferedReader(new FileReader("employees.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<StringTokenizer> readAllRecords() {
		String record;
		List<StringTokenizer> records=new ArrayList<>();
		try {
			while((record=bufferedReader.readLine())!=null) {
				StringTokenizer st=new StringTokenizer(record,",");
				records.add(st);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return records;
	}
	
	public void closeOutputFile() {
		try {
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void writeObjectInFile(Object object) {
		Employee employee = (Employee)object;
		try {
			bufferedWriter.write(employee.getId()+","+employee.getName()+","+employee.getContact()+","+employee.getEmail());
			bufferedWriter.flush();
			bufferedWriter.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Employee readObjectFromFile() {
		return null;
	}

}
