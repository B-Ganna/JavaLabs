package com.goit.gojavaonline.Module3.uml1;


import java.util.List;

public class Directory {
    private List<File> files;
    private List<Directory> directories;

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<Directory> getDirectories() {
        return directories;
    }

    public void setDirectories(List<Directory> directories) {
        this.directories = directories;
    }
}
