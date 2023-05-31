package demo2;

public class Room {
    int id;
    String name;
    String room;

    public Room(int id, String name, String room) {
        this.id = id;
        this.name = name;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    public String toString(){
        return id+"-"+ name+"-"+ room;
    }
}
