package convertor;

import java.io.File;

public class RenameFiles {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "C:\\Users\\HP\\Documents\\MY Data\\Enterrainment\\Gita";
        
        // Create a File object for the directory
        File directory = new File(directoryPath);
        
        // Get all files in the directory
        File[] files = directory.listFiles();

        if (files != null) {
            // Iterate through all the files in the directory
            for (File file : files) {
                // Get the current file name and trim any leading or trailing spaces
                String fileName = file.getName().trim();
                
                // Print the trimmed file name for debugging purposes
                System.out.println("Checking file: " + fileName);
                
                // Extract the number from the last set of parentheses after trimming
                if (fileName.matches("(?i).*\\(\\d+\\)\\.mp3")) {
                    String number = fileName.replaceAll("(?i).*\\((\\d+)\\)\\.mp3", "$1");
                    
                    // Construct the new file name
                    String newFileName = "Maha-Gita-" + number + ".mp3";
                    
                    // Rename the file
                    File newFile = new File(directoryPath + "\\" + newFileName);
                    if (file.renameTo(newFile)) {
                        System.out.println("Renamed: " + fileName + " -> " + newFileName);
                    } else {
                        System.out.println("Failed to rename: " + fileName);
                    }
                }
            }
        } else {
            System.out.println("Directory is empty or does not exist.");
        }
    }
}
