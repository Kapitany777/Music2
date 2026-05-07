package eu.braincluster;

public class Track
{
    private int trackId;

    private String trackName;

    private String album;

    private int milliseconds;

    private int bytes;

    private double unitPrice;

    private int artistId;

    public Track(int trackId, String trackName, String album, int milliseconds, int bytes, double unitPrice, int artistId)
    {
        this.trackId = trackId;
        this.trackName = trackName;
        this.album = album;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitPrice = unitPrice;
        this.artistId = artistId;
    }

    public int getTrackId()
    {
        return trackId;
    }

    public void setTrackId(int trackId)
    {
        this.trackId = trackId;
    }

    public String getTrackName()
    {
        return trackName;
    }

    public void setTrackName(String trackName)
    {
        this.trackName = trackName;
    }

    public String getAlbum()
    {
        return album;
    }

    public void setAlbum(String album)
    {
        this.album = album;
    }

    public int getMilliseconds()
    {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds)
    {
        this.milliseconds = milliseconds;
    }

    public int getBytes()
    {
        return bytes;
    }

    public void setBytes(int bytes)
    {
        this.bytes = bytes;
    }

    public double getUnitPrice()
    {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public int getArtistId()
    {
        return artistId;
    }

    public void setArtistId(int artistId)
    {
        this.artistId = artistId;
    }

    @Override
    public String toString()
    {
        return "Track{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", album='" + album + '\'' +
                ", milliseconds=" + milliseconds +
                ", bytes=" + bytes +
                ", unitPrice=" + unitPrice +
                ", artistId=" + artistId +
                '}';
    }
}
