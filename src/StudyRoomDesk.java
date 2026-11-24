public class StudyRoomDesk {
    private int availableRooms;
    StudyRoomDesk(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    public synchronized boolean reserveRoom(String studentName) throws InterruptedException {
        if (availableRooms > 0){
            System.out.println("Reserving Room...");
            Thread.sleep(200);
            System.out.println("Room Reserved");
            return true;
        }
        else {
            System.out.println("Room Not Reserved, not enough rooms");
            return false;
        }
    }


}
