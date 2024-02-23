/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author umers
 */
public class TestUserprofile {
    private String name;
    private String favoriteActor;

    public TestUserprofile(String name, String favoriteActor) {
        this.name = name;
        this.favoriteActor = favoriteActor;
    }

    public void createProfile() {
        System.out.println("Creating user profile...");
        System.out.println("User Profile Created:");
        System.out.println("Name: " + name);
        System.out.println("Favorite Actor: " + favoriteActor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite actor: ");
        String favoriteActor = scanner.nextLine();

        TestUserprofile userProfile = new TestUserprofile(name, favoriteActor);
        userProfile.createProfile();

        scanner.close();
    }
}
