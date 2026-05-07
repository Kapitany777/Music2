package eu.braincluster;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MusicRepository
{
    private final String URL = "jdbc:sqlite:Music.db";

    public List<TrackQuery> getAll()
    {
        try
        {
            var tracks = new ArrayList<TrackQuery>();

            Connection conn = DriverManager.getConnection(URL);
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("""
                SELECT t.trackid,
                       t.trackname,
                       t.album,
                       t.milliseconds,
                       t.bytes,
                       t.unitprice,
                       a.name as artistname
                  FROM tracks t
                  JOIN artists a ON t.artistid = a.artistid 
                  ORDER BY t.trackid""");

            while(rs.next())
            {
                int trackid = rs.getInt("trackid");
                String trackname = rs.getString("trackname");
                String album = rs.getString("album");
                int milliseconds = rs.getInt("milliseconds");
                byte bytes = rs.getByte("bytes");
                double unitprice = rs.getDouble("unitprice");
                String artistname = rs.getString("artistname");

                var trackQuery = new TrackQuery(trackid, trackname, album, milliseconds, bytes, unitprice, artistname);

                tracks.add(trackQuery);
            }

            return tracks;
        }
        catch (SQLException e)
        {
            System.out.println("Database connection error: "  + e.getMessage());
            return null;
        }

    }
}
