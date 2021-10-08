package org.thatsdecent;

/**
 * Hello world!
 *
 */
public abstract class App
{
    //private User TestUser = new User("David Clarke","Software Developer");
    public static void main( String[] args )
    {
        User TestUser = new User("David Clarke","Software Developer");
        System.out.println(TestUser.getUserName());
    }
}
