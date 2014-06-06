package se.s8n.dupefinder;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;

public class FileDatabase {

    @SuppressWarnings("unused")
    private final String dbLocation;
    private Map<String, String> db = new HashMap<String, String>();

    FileDatabase(String dbLocation) {
        this.dbLocation = dbLocation;
    }

    boolean createDB(String dbRoot) {
        SimpleFileVisitor<Path> visitor = new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file,
                    BasicFileAttributes attrs) throws IOException {
                db.put(file.toString(), String.valueOf(attrs.size()));
                return FileVisitResult.CONTINUE;
            }

        };
        try {
            @SuppressWarnings("unused")
            Path xxx = Files.walkFileTree(Paths.get("."), visitor);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    boolean listDB() {
        return false;
    }

    boolean showDuplicates() {
        return false;
    }

    boolean findDups() {
        final Map<Long ,Path> foundFiles = new HashMap<>();
        SimpleFileVisitor<Path> visitor = new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file,
                    BasicFileAttributes attrs) throws IOException {
                if (foundFiles.containsKey(attrs.size())) {
                    System.out.println("Duplicates " + " " + file + " " + foundFiles.get(attrs.size()));
                } else {
                    foundFiles.put(attrs.size(), file);
                }
                return FileVisitResult.CONTINUE;
            }

        };
        try {
            @SuppressWarnings("unused")
            Path xxx = Files.walkFileTree(Paths.get("."), visitor);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;

    }
}
