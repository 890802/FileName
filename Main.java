package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String prefix = new String();
        String path = new String();
        String newName = new String();
        int files;
        int groups;

        System.out.println("Folder Path: ");
        path = input.next();

        System.out.println("File Group Prefix: ");
        prefix = input.next();

        System.out.println("Number of Groups: ");
        groups = input.nextInt();

        System.out.println("Files per Group: ");
        files = input.nextInt();

        /*Navigate to Path + Catch Error*/

        if(/*File Prefix Match*/){

            for(int i = 1; i <= groups; i++){

                System.out.println("Enter New File Prefix: ");
                newName = input.next();

                for(int j = 1; j <=files; j++){



                }

            }

        }
        else{

            System.out.println("Prefix not Found");

        }
    }
}
