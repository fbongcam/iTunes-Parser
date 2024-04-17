package com.github.pireba.itunesparser;

import java.net.URL;
import java.util.Date;
import java.util.Objects;

/**
 * This class represents an iTunes Library.<br>
 * Every property of an iTunes Library is stored in this object.
 * 
 * @version 1.1
 * @author Phillip Remmert
 * @see
 * 		<a
 * 			href="https://developer.apple.com/documentation/ituneslibrary/itlibrary">
 * 			ITLibrary
 * 		</a>
 */
public class Library {
	private String applicationVersion;
	private Date date;
	private Integer features;
	private String libraryPersistentID;
	private Integer majorVersion;
	private Integer minorVersion;
	private URL musicFolder;
	private Boolean showContentRatings;
	
	// Constructor
	public Library() {}
	
	// --------------------------------------------------
	// Getter
	// --------------------------------------------------
	
	public String getApplicationVersion() {
		return this.applicationVersion;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public Integer getFeatures() {
		return this.features;
	}
	
	public String getLibraryPersistentID() {
		return this.libraryPersistentID;
	}
	
	public Integer getMajorVersion() {
		return this.majorVersion;
	}
	
	public Integer getMinorVersion() {
		return this.minorVersion;
	}
	
	public URL getMusicFolder() {
		return this.musicFolder;
	}
	
	public Boolean isShowContentRatings() {
		return this.showContentRatings;
	}
	
	// --------------------------------------------------
	// Setter
	// --------------------------------------------------
	
	public void setApplicationVersion(String applicationVersion) {
		this.applicationVersion = applicationVersion;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setFeatures(Integer features) {
		this.features = features;
	}
	
	public void setLibraryPersistentID(String libraryPersistentID) {
		this.libraryPersistentID = libraryPersistentID;
	}
	
	public void setMajorVersion(Integer majorVersion) {
		this.majorVersion = majorVersion;
	}
	
	public void setMinorVersion(Integer minorVersion) {
		this.minorVersion = minorVersion;
	}
	
	public void setMusicFolder(URL musicFolder) {
		this.musicFolder = musicFolder;
	}
	
	public void setShowContentRatings(Boolean showContentRatings) {
		this.showContentRatings = showContentRatings;
	}

    @Override
    public String toString()
    {
        return "Library [applicationVersion=" + applicationVersion + ", date=" + date + ", features=" + features
                + ", libraryPersistentID=" + libraryPersistentID + ", majorVersion=" + majorVersion + ", minorVersion="
                + minorVersion + ", musicFolder=" + musicFolder + ", showContentRatings=" + showContentRatings + "]";
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(applicationVersion, date, features, libraryPersistentID, majorVersion, minorVersion,
                musicFolder, showContentRatings);
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
        Library other = (Library) obj;
        return Objects.equals(applicationVersion, other.applicationVersion) && Objects.equals(date, other.date)
                && Objects.equals(features, other.features)
                && Objects.equals(libraryPersistentID, other.libraryPersistentID)
                && Objects.equals(majorVersion, other.majorVersion) && Objects.equals(minorVersion, other.minorVersion)
                && Objects.equals(musicFolder, other.musicFolder)
                && Objects.equals(showContentRatings, other.showContentRatings);
    }
	
}