package es.ait.yoplp.playlist;

/**
 * Singleton version of the PlayList class that we will use to storage the files of the active playlist.
 *
 */
public class PlayListManager<Track extends Comparable<Track>> extends PlayList<Track>
{
    private static PlayListManager instance;

    private PlayListManager()
    {
    }

    /**
     * returns de only instance of the playlist
     * @return
     */
    public static PlayListManager getInstance()
    {
        if ( instance == null )
        {
            instance = new PlayListManager();
        }
        return instance;
    }

}
