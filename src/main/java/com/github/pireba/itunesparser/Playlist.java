package com.github.pireba.itunesparser;

import java.util.Map;
import java.util.Objects;

/**
 * This class represents an iTunes Playlist.<br>
 * Every property of an iTunes Playlist is stored in this object.<br>
 * The Tracks of a Playlist are stored as a Map of {@linkplain Track} objects in the attribute "playlistItems".
 * 
 * @version 1.1
 * @author Phillip Remmert
 * @see
 * 		<a
 * 			href="https://developer.apple.com/documentation/ituneslibrary/itlibplaylist">
 * 			ITLibPlaylist
 * 		</a>
 */
public class Playlist {
	private Boolean allItems;
	private Boolean audiobooks;
	private Integer distinguishedKind;
	private Boolean folder;
	private Boolean master;
	private Boolean movies;
	private Boolean music;
	private String name;
	private String parentPersistentID;
	private Integer playlistID;
	private Map<Integer, Track> playlistItems;
	private String playlistPersistentID;
	private Boolean podcasts;
	private String smartCriteria;
	private String smartInfo;
	private Boolean tvShows;
	private Boolean visible;
    private String description;
	
	// --------------------------------------------------
	// Getter
	// --------------------------------------------------

    public Boolean isAllItems() {
		return this.allItems;
	}
	
	public Boolean isAudiobooks() {
		return this.audiobooks;
	}
	
	public Integer getDistinguishedKind() {
		return this.distinguishedKind;
	}
	
	public Boolean isFolder() {
		return this.folder;
	}
	
	public Boolean isMaster() {
		return this.master;
	}
	
	public Boolean isMovies() {
		return this.movies;
	}
	
	public Boolean isMusic() {
		return this.music;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getParentPersistentID() {
		return this.parentPersistentID;
	}
	
	public Integer getPlaylistID() {
		return this.playlistID;
	}
	
	public Map<Integer, Track> getPlaylistItems() {
		return this.playlistItems;
	}
	
	public String getPlaylistPersistentID() {
		return this.playlistPersistentID;
	}
	
	public Boolean isPodcasts() {
		return this.podcasts;
	}
	
	public String getSmartCriteria() {
		return this.smartCriteria;
	}
	
	public String getSmartInfo() {
		return this.smartInfo;
	}
	
	public Boolean isTvShows() {
		return this.tvShows;
	}
	
	public Boolean isVisible() {
		return this.visible;
	}
	
	public String getDescription() {
        return description;
    }
	
	// --------------------------------------------------
	// Setter
	// --------------------------------------------------
	
	public void setAllItems(Boolean allItems) {
		this.allItems = allItems;
	}
	
	public void setAudiobooks(Boolean audiobooks) {
		this.audiobooks = audiobooks;
	}
	
	public void setDistinguishedKind(Integer distinguishedKind) {
		this.distinguishedKind = distinguishedKind;
	}
	
	public void setFolder(Boolean folder) {
		this.folder = folder;
	}
	
	public void setMaster(Boolean master) {
		this.master = master;
	}
	
	public void setMovies(Boolean movies) {
		this.movies = movies;
	}
	
	public void setMusic(Boolean music) {
		this.music = music;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setParentPersistentID(String parentPersistentID) {
		this.parentPersistentID = parentPersistentID;
	}
	
	public void setPlaylistID(Integer playlistID) {
		this.playlistID = playlistID;
	}
	
	public void setPlaylistItems(Map<Integer, Track> playlistItems) {
		this.playlistItems = playlistItems;
	}
	
	public void setPlaylistPersistentID(String playlistPersistentID) {
		this.playlistPersistentID = playlistPersistentID;
	}
	
	public void setPodcasts(Boolean podcasts) {
		this.podcasts = podcasts;
	}
	
	public void setSmartCriteria(String smartCriteria) {
		this.smartCriteria = smartCriteria;
	}
	
	public void setSmartInfo(String smartInfo) {
		this.smartInfo = smartInfo;
	}
	
	public void setTvShows(Boolean tvShows) {
		this.tvShows = tvShows;
	}
	
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "Playlist [allItems=" + allItems + ", audiobooks=" + audiobooks + ", distinguishedKind="
                + distinguishedKind + ", folder=" + folder + ", master=" + master + ", movies=" + movies + ", music="
                + music + ", name=" + name + ", parentPersistentID=" + parentPersistentID + ", playlistID=" + playlistID
                + ", playlistItems=" + playlistItems + ", playlistPersistentID=" + playlistPersistentID + ", podcasts="
                + podcasts + ", smartCriteria=" + smartCriteria + ", smartInfo=" + smartInfo + ", tvShows=" + tvShows
                + ", visible=" + visible + ", description=" + description + "]";
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(allItems, audiobooks, description, distinguishedKind, folder, master, movies, music, name,
                parentPersistentID, playlistID, playlistItems, playlistPersistentID, podcasts, smartCriteria, smartInfo,
                tvShows, visible);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Playlist other = (Playlist) obj;
        return Objects.equals(allItems, other.allItems) && Objects.equals(audiobooks, other.audiobooks)
                && Objects.equals(description, other.description)
                && Objects.equals(distinguishedKind, other.distinguishedKind) && Objects.equals(folder, other.folder)
                && Objects.equals(master, other.master) && Objects.equals(movies, other.movies)
                && Objects.equals(music, other.music) && Objects.equals(name, other.name)
                && Objects.equals(parentPersistentID, other.parentPersistentID)
                && Objects.equals(playlistID, other.playlistID) && Objects.equals(playlistItems, other.playlistItems)
                && Objects.equals(playlistPersistentID, other.playlistPersistentID)
                && Objects.equals(podcasts, other.podcasts) && Objects.equals(smartCriteria, other.smartCriteria)
                && Objects.equals(smartInfo, other.smartInfo) && Objects.equals(tvShows, other.tvShows)
                && Objects.equals(visible, other.visible);
    }
    
}