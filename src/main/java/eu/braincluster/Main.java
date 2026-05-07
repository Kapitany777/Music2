package eu.braincluster;

public class Main
{
    public static void main(String[] args)
    {
        var repo = new MusicRepository();

        var tracks = repo.getAll();

        /* for (var track : tracks)
        {
            System.out.println(track);
        }*/

        System.out.println(repo.getLongest());
    }
}