
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shaurav
 */
public class CSVReader {
    private static final String COMMA_DELIMITER = ",";
    static int i = 0;
    public static void readCsvFile(String fileName) {

        System.out.println("called");
		BufferedReader fileReader = null;
     
        try {
        	
        	//Create a new list of student to be filled by CSV file data 
        	List students = new ArrayList();
        	
            String line = "";
            
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileName));
            
            //Read the CSV file header to skip it
            fileReader.readLine();
            int count = 0;
            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                	//Create a new student object and fill his  data
//					Student student = new Student(Long.parseLong(tokens[STUDENT_ID_IDX]), tokens[STUDENT_FNAME_IDX], tokens[STUDENT_LNAME_IDX], tokens[STUDENT_GENDER], Integer.parseInt(tokens[STUDENT_AGE]));
//                                					students.add(student);
                    if (tokens[8].equals( "1000")){
                        count++;
                        System.out.println("sadfsadfasd");
                        System.out.println(tokens[8]);
                        System.out.println(count);
                    
                }
//                    System.out.println(tokens[8]);
                      System.out.println(count);
                    
				}
            }
            
            //Print the new student list
//            for (Student student : students) {
//				System.out.println(student.toString());
//			}
            System.out.println("sdf"+i);
        } 
        
        catch (Exception e) {
        	System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
            	System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }

	}

    

    
}
