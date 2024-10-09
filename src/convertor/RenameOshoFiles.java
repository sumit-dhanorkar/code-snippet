package convertor;

import java.io.File;

public class RenameOshoFiles {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "C:\\Users\\HP\\Documents\\MY Data\\Enterrainment\\krishna1";

        // Create a File object representing the directory
        File directory = new File(directoryPath);

        // Get all files in the directory
        File[] files = directory.listFiles();

        // Check if the directory is valid
        if (files != null) {
            for (File file : files) {
                String fileName = file.getName();

                // Check if the filename starts with "OSHO-Sambhog_Se_"
                if (fileName.startsWith("OSHO-")) {
                    // Remove the "OSHO-Sambhog_Se_" prefix
                    String newFileName = fileName.replaceFirst("OSHO-", "");

                    // Create the new file object with the new name
                    File renamedFile = new File(directoryPath + "\\" + newFileName);

                    // Rename the file
                    if (file.renameTo(renamedFile)) {
                        System.out.println("Renamed: " + fileName + " -> " + newFileName);
                    } else {
                        System.out.println("Failed to rename: " + fileName);
                    }
                }
            }
        } else {
            System.out.println("The directory is empty or doesn't exist.");
        }
    }
}
