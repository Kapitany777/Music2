package eu.braincluster;

public class Main
{
    public static void main(String[] args)
    {
        var repo = new MusicRepository();

        var tracks = repo.getAll();

        for (var track : tracks)
        {
            System.out.println(track);
        }

        System.out.println(repo.getLongest());
        System.out.println(repo.getRocks());

        // boolean success = repo.addTrack(new Track(0, "Sálálá", "Teszt", 100000, 10000000, 0.99, 1));
        // System.out.println(success);
    }
}