package model.room;

import model.room.enums.RoomType;

/*
 * Copyright (c) 2023. Taras Bahnyuk
 * All rights reserved.
 */
public class FreeRoom extends Room {

    public FreeRoom(final String roomNumber, final RoomType enumeration) {
        super(roomNumber, 0.0, enumeration);
    }

    @Override
    public String toString() {
        return "FreeRoom => " + super.toString();
    }

}
