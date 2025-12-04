package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
public class StudentViewerController {
    @FXML
    private TextArea descTextArea;
    @FXML
    private ListView<Student> studentListView;  
    private final ObservableList<Student> students = FXCollections.observableArrayList();   
    public void initialize() {
    	// create course grade array for an undergrad student
    	// create the objects with the values from the document
		CourseGrade [] c1 = new CourseGrade[2];
		c1[0] = new CourseGrade("Advanced Algorithms", "CS600","C");
		c1[1] = new CourseGrade("Advanced Machine Learning", "CS700", "B");  	
    	// create course grade array for an graduate student
    	// create the objects with the values from the document
		CourseGrade [] c2 = new CourseGrade[2];
		c2[0] = new CourseGrade("Algorithmic Problem Solve I", "CS101","B");
		c2[1] = new CourseGrade("Algorithmic Problem Solve II", "CS204", "A");	
		students.add(new UndergraduateStudent("John Smith", "11",c2 ));
		students.add(new GraduateStudent("Elli Barn", "112",c1 ));
    	studentListView.setItems(students);
    	// add listener
    	studentListView.getSelectionModel().selectedItemProperty().addListener(
    			new ChangeListener<Student>() {
    				@Override
    				public void changed(ObservableValue<? extends Student> ov, 
    						Student oldValue,Student newValue) {
    					String allString = "";
    					allString += String.format("Student name: %s%nId: %s%nCourses%n",
    							newValue.getName(),	newValue.getId());
    					for(int i = 0; i < newValue.getCourses().length; i++) {
    						allString += String.format("%s%n", newValue.getCourses()[i]);
    					}
    					allString += String.format("GPA: %.2f", newValue.calculateGPA());
    					descTextArea.setText(allString);
    			}
    		}
    	);
    	
    	
    }

}