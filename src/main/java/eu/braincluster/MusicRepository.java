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
                int trackId = rs.getInt("trackid");
                String trackName = rs.getString("trackname");
                String album = rs.getString("album");
                int milliseconds = rs.getInt("milliseconds");
                byte bytes = rs.getByte("bytes");
                double unitPrice = rs.getDouble("unitprice");
                String artistName = rs.getString("artistname");

                var trackQuery = new TrackQuery(trackId, trackName, album, milliseconds, bytes, unitPrice, artistName);

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
