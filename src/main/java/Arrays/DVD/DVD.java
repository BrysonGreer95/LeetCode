package main.java.Arrays.DVD;

// To run: in the correct directory, execute javac DVD.java and then java DVD.java
// A simple definition for a DVD.
public class DVD {
    public static DVD[] dvdCollection = new DVD[15];

    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "name='" + getName() + "'" + ", releaseYear='" + getReleaseYear() + "'" + ", director='" + getDirector();
    }

    public static void main(String[] args) {
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        // Put "The Incredibles" into the 4th place: index 3.
        dvdCollection[3] = incrediblesDVD;

        // Put "Finding Dory" into the 10th place: index 9.
        dvdCollection[9] = findingDoryDVD;

        // Should result in null
        System.out.println(dvdCollection[1]);

        // Should result in "name='The Incredibles', releaseYear='2004',
        // director='Brad Bird"
        System.out.println(dvdCollection[3]);
    }
}