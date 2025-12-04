import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class KBFiles {

	public static void main(String[] args) throws IOException{
		// given a directory path, traverse the directory and print the paths of files
		// that have size greater than 1 KB
		
		Path myPath = Paths.get("C:\\Users\\Student-Win11\\Documents");
		
		if(Files.isDirectory(myPath))
		{
			System.out.printf("Directory contents:%n");

			// object for iterating through a directory's contents
			DirectoryStream<Path> directoryStream = Files.newDirectoryStream(myPath);

			for (Path p : directoryStream) 
			{
				if(!(Files.isDirectory(p))) 
				{
					if(Files.size(p) > 1024)
						System.out.printf("%s %d%n",p.getFileName(), Files.size(p));
				}		
			} 
			directoryStream.close();

		}

	}
}
