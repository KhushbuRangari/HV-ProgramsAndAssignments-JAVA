
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Node {
    Song data;
    Node next;
   

    public Node(Song data) {
        this.data = data;
        next = null;
    }
}

class songLinkedList {
    Node head;
    int size;

    public void addSong(Song data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            // System.out.println("playlist is empty");
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            size++;
            currNode.next = newNode;
        }
    }

    public void removeFirstSong() {
      
        if (head == null) { 
             System.out.println("Playlist is Empty");
        } else {
            Node currNode = head;
            // while (currNode.next != null) {
            //     currNode = currNode.next;
            // }
            size--;
           head=currNode.next;
        }
    }

    public void removeLastSong() {
      
        if (head == null) { 
             System.out.println("Playlist is Empty");
        } 
        
        if(head.next==null){
            head=null;
            return;
        }
        else {
            Node currNode = head.next;
            // System.out.println("\nCurr data"+currNode.data.title);
            Node prevNode = head;
            // System.out.println("\npre data"+prevNode.data.title);
            while (currNode.next != null) {
                prevNode=prevNode.next;
                currNode=currNode.next;
            }
            size--;
            System.out.println("\n"+prevNode.next.data.title +"****is removed\n");
            prevNode.next=null;
       

        }
    }


    public void printList() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) 
        {
            System.out.println("("+currNode.data.title + ")  " + currNode.data.artist + " " + currNode.data.duration);            currNode = currNode.next;
        }
        System.out.println("Total No of Songs in this Playlist is :"+size);

    }
}

class playList {
    Song sng;

    List<Song> list = new LinkedList<>();
    int i = ((int) Math.floor(Math.random() * list.size()));

    public playList(Song sng) {
        this.sng = sng;
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void addSongToPosition(int i, Song s) {
        list.add(i, s);
    }

    public void removeSong(Song s) {
        list.remove(s);

    }

    public void sortList() {
        Collections.sort(list);
    }

    public void shuffleList() {
        Collections.shuffle(list);
    }

    public void showList() {
        System.out.println("\nTitle " + "| Singer " + "| Duration  \n");
        for (Song s1 : list) {
            // Print the sorted LinkedList
            System.out.println("("+s1.title +")"+ " | " + s1.artist + " | "
                    + s1.duration);
        }

    }

    public double totalDuration() {
        double total = 0;
        for (Song s : list) {
            total += s.duration;
        }
        return total;
    }

}

class Song implements Comparable<Song> {

    String title;
    String artist;
    double duration;

    public Song(String title, String artist, double duration) {
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

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public int compareTo(Song s) {
        if (duration > s.duration) {
            return 1;
        } else if (artist == s.artist) {
            return 0;
        } else {
            return -1;
        }
    }

}

/**
 * Manager
 */
class PlayListMgmt {
    public static void main(String[] args) {
        Song s = new Song("Saathiya", "AR Rahman", 5.57);
        Song song1 = new Song("Jabra Fan", "Varun Grover", 3.5);
        Song song2 = new Song("Dangal", "Daler Mehendi", 4.2);
        Song song3 = new Song("Ala Barfi", "Mohit Chauhan", 2.8);
        Song song4 = new Song("Dil Chahata Hai", " Shankar Mahadevan", 5.1);

        songLinkedList newList = new songLinkedList();
        newList.addSong(s);
        newList.addSong(song1);
        newList.addSong(song2);
        newList.addSong(song3);
        newList.addSong(song4);

        newList.printList();
        // newList.removeFirstSong();
        // System.out.println("deleted first song");
        // newList.printList();


        newList.removeLastSong();
        System.out.println("\n********New List***********\n");
        newList.printList();

        playList newPlayList = new playList(s);
        newPlayList.addSong(s);
        newPlayList.addSong(song1);

        newPlayList.addSong(song2);
        newPlayList.addSong(song3);
        newPlayList.addSong(song4);

        newPlayList.addSongToPosition(1, song4);

        newPlayList.sortList();
        newPlayList.showList();

        newPlayList.shuffleList();
        newPlayList.showList();
        newPlayList.removeSong(song3);
        newPlayList.showList();

        double totalDuration = newPlayList.totalDuration();
        System.out.println("The total duration of the list is "+totalDuration+"min");

    }

}