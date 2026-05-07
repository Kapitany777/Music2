package eu.braincluster;

public class TrackQuery
{
    private int trackId;

    private String trackName;

    private String album;

    private int milliseconds;

    private int bytes;

    private double unitPrice;

    private String artistName;

    public TrackQuery(int trackId, String trackName, String album, int milliseconds, int bytes, double unitPrice, String artistName)
    {
        this.trackId = trackId;
        this.trackName = trackName;
        this.album = album;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitPrice = unitPrice;
        this.artistName = artistName;
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

    public String getArtistName()
    {
        return artistName;
    }

    public void setArtistName(String artistName)
    {
        this.artistName = artistName;
    }

    @Override
    public String toString()
    {
        return "TrackQuery{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", album='" + album + '\'' +
                ", milliseconds=" + milliseconds +
                ", bytes=" + bytes +
                ", unitPrice=" + unitPrice +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}
