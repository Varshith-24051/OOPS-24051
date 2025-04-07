import java.util.*;

class Room {
    private int roomNumber;
    private boolean isReserved;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isReserved = false;     }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public boolean isReserved() {
        return this.isReserved;
    }

    public void checkIn() {
        if (this.isReserved) {
            System.out.println("Room " + roomNumber + " is already reserved.");
        } else {
            this.isReserved = true;
            System.out.println("Room " + roomNumber + " has been reserved.");
        }
    }

    public void checkOut() {
        if (!this.isReserved) {
            System.out.println("Room " + roomNumber + " is not reserved.");
        } else {
            this.isReserved = false;
            System.out.println("Room " + roomNumber + " has been checked out and is now available.");
        }
    }
}

class Hotel {
    private Room room1;
    private Room room2;
    private Room room3;

    public Hotel() {
        this.room1 = new Room(101);
        this.room2 = new Room(102);
        this.room3 = new Room(103);
    }

    public void checkInRoom(int roomNumber) {
        switch (roomNumber) {
            case 101:
                room1.checkIn();
                break;
            case 102:
                room2.checkIn();
                break;
            case 103:
                room3.checkIn();
                break;
            default:
                System.out.println("Invalid room number.");
        }
    }

    public void checkOutRoom(int roomNumber) {
        switch (roomNumber) {
            case 101:
                room1.checkOut();
                break;
            case 102:
                room2.checkOut();
                break;
            case 103:
                room3.checkOut();
                break;
            default:
                System.out.println("Invalid room number.");
        }
    }

    public void showRoomStatus() {
        System.out.println("Room 101: " + (room1.isReserved() ? "Reserved" : "Available"));
        System.out.println("Room 102: " + (room2.isReserved() ? "Reserved" : "Available"));
        System.out.println("Room 103: " + (room3.isReserved() ? "Reserved" : "Available"));
    }
}

class HotelReservationSystem {
    public static void main(String[] args) {
        System.out.println("            -------Hotel Reservation System-------        ");
        System.out.println("        ------------------Hotel OPEN------------------------");

        Hotel hotel = new Hotel();

        hotel.showRoomStatus();

        hotel.checkInRoom(101);
        hotel.checkInRoom(102);

        hotel.showRoomStatus();

        hotel.checkOutRoom(101);
        hotel.checkInRoom(103);

        hotel.showRoomStatus();
        System.out.println("        ------------------Hotel CLOSED------------------------");
    }
}