package kaleb;
import java.util.ArrayList;
import java.util.Scanner;

public class songTrackRecords {
	 static Scanner scanner = new Scanner(System.in);
	    
	    public static char printMenu() {
	        System.out.println("\n===== Song Track Record CRUD =====");
	        System.out.println("1. Add Song");
	        System.out.println("2. Search Song");
	        System.out.println("3. Update Song");
	        System.out.println("4. Delete Song");
	        System.out.println("5. Display All Songs");
	        System.out.println("6. Exit");
	        String input = scanner.nextLine();
	        return input.charAt(0);
	    }

	    public static void main(String[] args) {
	        SongTrackRecord record = new SongTrackRecord();
	        
	        while(true) {
	            char choice = printMenu();
	            switch(choice) {
	                case '1':
	                    System.out.println("Title of the song: ");
	                    String title = scanner.nextLine();
	                    System.out.println("Artist of the song: ");
	                    String artist = scanner.nextLine();
	                    System.out.println("Duration of the song: ");
	                    String duration = scanner.nextLine();
	                    record.addSong(new Song(title, artist, duration));
	                    break;
	                case '2':
	                    System.out.println("Title of the song: ");
	                    String songTitle = scanner.nextLine();
	                    record.searchSong(songTitle);
	                    break;
	                case '3':
	                    System.out.println("Title of the song: ");
	                    String title2 = scanner.nextLine();
	                    System.out.println("New title of the song: ");
	                    String newTitle = scanner.nextLine();
	                    System.out.println("New artist of the song: ");
	                    String newArtist = scanner.nextLine();
	                    System.out.println("New duration of the song: ");
	                    String newDuration = scanner.nextLine();
	                    record.updateSong(title2, newTitle, newArtist, newDuration);
	                    break;
	                case '4':
	                    System.out.println("Title of the song: ");
	                    String deleteTitle = scanner.nextLine();
	                    record.deleteSong(deleteTitle);
	                    break;
	                case '5':
	                    record.getSongsList();
	                    break;
	                case '6':
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice!, please try again");
	            }
	        }
	    }
	}

	class Song {
	    private String title;
	    private String artist;
	    private String duration;
	    
	    Song(String title, String artist, String duration) {
	        this.title = title;
	        this.artist = artist;
	        this.duration = duration;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getArtist() {
	        return artist;
	    }

	    public void setArtist(String artist) {
	        this.artist = artist;
	    }

	    public String getDuration() {
	        return duration;
	    }

	    public void setDuration(String duration) {
	        this.duration = duration;
	    }
	    
	    @Override
	    public String toString() {
	        return this.artist + "\t" + this.title + "\t" + this.duration;
	    }
	    
	}

	class SongTrackRecord {
	    ArrayList<Song> songDatabase = new ArrayList();
	    
	    public void addSong(Song song) {
	        this.songDatabase.add(song);
	        System.out.println("Song added successfully");
	    }
	    
	    public String[] getSongsList() {
	        String[] songs = new String[this.songDatabase.size()];
	        for(Song song: this.songDatabase) {
	            System.out.println(song.toString());
	            songs[this.songDatabase.indexOf(song)] = song.toString();
	        }
	        return songs;
	    }
	    
	    public String searchSong(String title) {
	       for(Song song: this.songDatabase) {
	           if(song.getTitle().equals(title)){
	              System.out.println(song.toString());
	              return song.toString();
	           }
	       }
	       System.out.println("Song not found!!");
	       return "";
	    }
	    
	    public String updateSong(String title, String newTitle, String newArtist, String newDuration) {
	        for(Song song: this.songDatabase) {
	           if(song.getTitle().equals(title)){
	            Song updatedSong = new Song(
	                newTitle != null ? newTitle : song.getTitle(),
	                newArtist != null ? newArtist : song.getArtist(),
	                newDuration != null ? newDuration : song.getDuration()
	            );
	            this.songDatabase.remove(song);
	            this.songDatabase.add(updatedSong);
	            return updatedSong.toString();
	           }
	       }
	       System.out.println("Song not found!!");
	       return "";
	    }
	    
	    public void deleteSong(String title) {
	        for(Song song: this.songDatabase) {
	           if(song.getTitle().equals(title)){
	              this.songDatabase.remove(song);
	              return;
	           }
	       }
	       System.out.println("Song not found!!");
	    }
	}



