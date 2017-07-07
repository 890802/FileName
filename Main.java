package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String prefix = new String();
        String path = new String();
        String newName = new String();
        String fileType = new String();
        String workingPath = new String();
        int files;
        int groups;

        System.out.println("Folder Path: ");
        path = input.next();

        /*System.out.println("File Group Prefix: ");
        prefix = input.next();*/

        System.out.println("Number of Groups: ");
        groups = input.nextInt();

        System.out.println("Files per Group: ");
        files = input.nextInt();

        System.out.println("FileType: ");
        fileType = input.next();

        //Modification

        if (fileType.substring(0,1).compareTo(".") == 0){

            fileType = fileType.substring(1);

        }

        if(path.substring(path.length() - 1).compareTo("/") == 0 ||path.substring(path.length() - 1).compareTo("\\") == 0 ){

            path = path.substring(0,path.length() - 1);
            System.out.println(path);

        }

        File dir = new File(path);

        //Renaming

        if(dir.isDirectory()) {

            int it = 1;

            for (File old : dir.listFiles()) {

                if(old.isDirectory() == false) {

                    if (it == 1) {


                        System.out.println("Prefix: ");
                        newName = input.next();
                        File makeDir = new File(path + "/" + newName);
                        workingPath = path + "/" + newName;
                        makeDir.mkdir();

                    }

                    if (it < files) {

                        try {
                            File newFile = new File(workingPath + "/" + newName + it + "." + fileType);

                            if (old.renameTo(newFile)) {
                                System.out.println("Rename successful");
                            } else {
                                System.out.println("Rename failed");
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                            e.printStackTrace();
                        }
                        it++;

                    } else {

                        try {
                            File newFile = new File(workingPath + "/" + newName + it + "." + fileType);

                            if (old.renameTo(newFile)) {
                                System.out.println("Rename successful");
                            } else {
                                System.out.println("Rename failed");
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                            e.printStackTrace();
                        }
                        it = 1;

                    }

                }

            }

        }
        else{

            System.out.println("Path not Found");

        }
    }
}
