public class RoomBookingTask implements Runnable {
    private final StudyRoomDesk desk;

    public RoomBookingTask(StudyRoomDesk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        try {
            desk.reserveRoom(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    // step 3.1 Final part of this step
    // Execution in main
}
