package kaleb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class songTrackRecordsTest {

	 SongTrackRecord record = new SongTrackRecord();
	    
	    @Test
	    public void testAddSong() {
	        Song newSong = new Song("Mamacita", "Travis Scott", "2:30");
	        record.addSong(newSong);
	        assertEquals(1, record.songDatabase.size());
	    }
	    
	    @Test
	    public void testSearchSong() {
	        Song newSong = new Song("Mamacita", "Travis Scott", "2:30");
	        record.addSong(newSong);
	        assertEquals("Travis Scott\tMamacita\t2:30", record.searchSong("Mamacita"));
	    }
	    
	    @Test
	    public void testUpdateSong() {
	        Song newSong = new Song("Mamacita", "Travis Scott", "2:30");
	        record.addSong(newSong);
	        String updatedSong = record.updateSong("Mamacita", "Take your time", "DIIV", "3:45");
	        assertEquals("DIIV\tTake your time\t3:45", updatedSong);
	    }
	    
	    @Test
	    public void testDeleteSong() {
	        Song newSong = new Song("Mamacita", "Travis Scott", "2:30");
	        record.addSong(newSong);
	        record.deleteSong("Mamacita");
	        assertEquals(0, record.songDatabase.size());
	    }
	    
	    @Test
	    public void testGetSongList() {
	        Song newSong = new Song("Mamacita", "Travis Scott", "2:30");
	        record.addSong(newSong);
	        String songList = record.getSongsList()[0];
	        assertEquals("Travis Scott\tMamacita\t2:30", songList);
	}

}
