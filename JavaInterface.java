//LABEXERCISE - 4 -> Implementation of interfaces in java programming 
// AUTHOR -> Suvajit Karmakar
// REGISTRATION NUMBER -> 2347261
// DATE -> 28/11/2023



//INTERFACE LEVEL 1
interface SocialApplication {
    void checkFollowers();
    void createPosts();
    void follow();
    void accountDetails();
}

// LEVEL 2 INTERFACE 
abstract class Subham implements SocialApplication {
    public void checkFollowers() {
        System.out.println("YOU HAVE " + 567 + " FOLLOWERS IN YOUR ACCOUNT");
    }
}

// LEVEL 3 INTERFACE
abstract class Chowdhury extends Subham {
    public void createPosts() {
        System.out.println("SUBHAM AND CHOWDHURY POSTED AN IMAGE TOGETHER IN THE FOOT HILLS OF HIMALAYA");
    }
}

// LEVEL 4 INTERFACE 
class Suvajit extends Chowdhury {
    public void follow() {
        System.out.println("SUVAJIT STARTED FOLLOWING CHOWDHURY 45s AGO");
    }

    public void accountDetails() {
        System.out.println("NAME -> SUVAJITKAMAKAR");
        System.out.println("USERNAME -> @hlosuvajit");
        System.out.println("FOLLOWERS -> 5670");
        System.out.println("FOLLOWING -> 1234");
        System.out.println("RECENT ACTIVITY -> SUVAJIT STARTED FOLLOWING CHOWDHURY");
    }
}

public class JavaInterface {
    public static void main(String[] args) {
        Suvajit hlosuvajit = new Suvajit();
        hlosuvajit.accountDetails();
        hlosuvajit.checkFollowers();
        hlosuvajit.createPosts();
        hlosuvajit.follow();
    }
}
