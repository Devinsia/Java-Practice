package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CoverViewerController {

    @FXML
    private ListView<Book> booksListView;

    @FXML
    private ImageView coverImageView;

    private final ObservableList<Book> books = FXCollections.observableArrayList();
    
    public void initialize() {
    	books.add(new Book("Java How to Program", 
    			"file:/C:/Users/Student-Win11/eclipse-workspace/CoverViewerApp/src/application/images/small/jhtp.jpg",
    			"file:/C:/Users/Student-Win11/eclipse-workspace/CoverViewerApp/src/application/images/large/jhtp.jpg") );
    	books.add(new Book("C++ How to Program",
    			"file:/C:/Users/Student-Win11/eclipse-workspace/CoverViewerApp/src/application/images/small/cpphtp.jpg",
    			"file:/C:/Users/Student-Win11/eclipse-workspace/CoverViewerApp/src/application/images/large/cpphtp.jpg"));
    	booksListView.setItems(books);
    	
    	booksListView.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Book>() {                                   
                    @Override                                                     
                    public void changed(ObservableValue<? extends Book> ov, Book oldValue, Book newValue) {                        
                       coverImageView.setImage(new Image(newValue.getLargeImage()));
                    }
                 }
              ); 
    }
}
