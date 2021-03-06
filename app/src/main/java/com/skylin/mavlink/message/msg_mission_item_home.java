package com.skylin.mavlink.message;

import com.MAVLink.common.msg_mission_item_int;
import com.MAVLink.enums.MAV_CMD;
import com.MAVLink.enums.MAV_FRAME;

/**
 * Created by sjj on 2017/4/14.
 */

public class msg_mission_item_home extends msg_mission_item_int {
    public msg_mission_item_home(short target_system, short target_component) {
        autocontinue = 1;
        command = MAV_CMD.MAV_CMD_NAV_WAYPOINT;
        current = 0;
        frame = MAV_FRAME.MAV_FRAME_GLOBAL;
        this.target_system = target_system;
        this.target_component = target_component;
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
}
