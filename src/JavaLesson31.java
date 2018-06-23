import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JavaLesson31 extends JFrame {
	
	static String filePath, parentDirectory;
	static File randomDir, randomFile, randomFile2;
	
	public static void main(String[] args) {
		randomDir = new File("/Users/Eric/Documents/Random");
		randomDir.mkdir();
		randomFile = new File("random.txt");
		randomFile2 = new File("/Users/Eric/eclipse-workspace/JavaCode");
		
		try {
			randomFile.createNewFile();
			randomFile2.createNewFile();
			
			filePath = randomFile.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (randomFile.exists()) {
			System.out.println("File exists");
			System.out.println("File Readable " + randomFile.canRead());
			System.out.println("File Writable " + randomFile.canWrite());
			System.out.println("File Location " + filePath);
			System.out.println("File Name " + randomFile.getName());
			System.out.println("Parent Directory " + randomFile.getParent());
			
			parentDirectory = randomFile2.getParent();
			System.out.println("Parent Directory " + parentDirectory);
			System.out.println("Is it a Directory " + randomDir.isDirectory());
//			File randomDir2 = new File("/Users/Documents");
//			File[] curDir = randomDir2.listFiles();
//			System.out.println("Names of Files!! Hakuna matata!!");
//			for(File f : curDir) {
//				if (f.isDirectory()) {
//					continue;
//				}
//				if (f.isFile()) {
//					System.out.println(f.getName());
//				}
//			}
			String[] filesInDir = randomDir.list();
			System.out.println("Files in Directory\n");
			
			for(String fileName : filesInDir) {
				System.out.println(fileName);
			}
			System.out.println("Is it a File: " + randomFile.isFile());
			System.out.println("Is it Hidden: " + randomFile.isHidden());
			System.out.println("Last Modified: " + randomFile.lastModified());
			System.out.println("File Size: " + randomFile.length());
			randomFile.renameTo(new File("Users/Documents/eclipse-workspace/JavaCode/random.txt"));
			
			new JavaLesson31();
			
			if(randomFile.delete()) {
				System.out.println("File deleted");
			}
			
			File[] filesInDir2 = randomDir.listFiles();
			for (File fileName : filesInDir2) {
				fileName.delete();
			}
			
//			if(randomDir.delete()) {
//				System.out.println("Directory deleted");
//			}
			
		} 
		
	} // End of Main
	
	public JavaLesson31() {
		JFileChooser fileChooser = new JFileChooser(randomDir);
		
		fileChooser.showOpenDialog(this);
		
	}
	
}
