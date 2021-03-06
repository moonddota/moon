/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE GIMBAL_SET_FACTORY_PARAMETERS PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
* 
            Set factory configuration parameters (such as assembly date and time, and serial number).  This is only intended to be used
            during manufacture, not by end users, so it is protected by a simple checksum of sorts (this won't stop anybody determined,
            it's mostly just to keep the average user from trying to modify these values.  This will need to be revisited if that isn't
            adequate.
        
*/
public class msg_gimbal_set_factory_parameters extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_GIMBAL_SET_FACTORY_PARAMETERS = 206;
    public static final int MAVLINK_MSG_LENGTH = 33;
    private static final long serialVersionUID = MAVLINK_MSG_ID_GIMBAL_SET_FACTORY_PARAMETERS;


    
    /**
    * Magic number 1 for validation
    */
    public long magic_1;
    
    /**
    * Magic number 2 for validation
    */
    public long magic_2;
    
    /**
    * Magic number 3 for validation
    */
    public long magic_3;
    
    /**
    * Unit Serial Number Part 1 (part code, design, language/country)
    */
    public long serial_number_pt_1;
    
    /**
    * Unit Serial Number Part 2 (option, year, month)
    */
    public long serial_number_pt_2;
    
    /**
    * Unit Serial Number Part 3 (incrementing serial number per month)
    */
    public long serial_number_pt_3;
    
    /**
    * Assembly Date Year
    */
    public int assembly_year;
    
    /**
    * System ID
    */
    public short target_system;
    
    /**
    * Component ID
    */
    public short target_component;
    
    /**
    * Assembly Date Month
    */
    public short assembly_month;
    
    /**
    * Assembly Date Day
    */
    public short assembly_day;
    
    /**
    * Assembly Time Hour
    */
    public short assembly_hour;
    
    /**
    * Assembly Time Minute
    */
    public short assembly_minute;
    
    /**
    * Assembly Time Second
    */
    public short assembly_second;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_GIMBAL_SET_FACTORY_PARAMETERS;
        
        packet.payload.putUnsignedInt(magic_1);
        
        packet.payload.putUnsignedInt(magic_2);
        
        packet.payload.putUnsignedInt(magic_3);
        
        packet.payload.putUnsignedInt(serial_number_pt_1);
        
        packet.payload.putUnsignedInt(serial_number_pt_2);
        
        packet.payload.putUnsignedInt(serial_number_pt_3);
        
        packet.payload.putUnsignedShort(assembly_year);
        
        packet.payload.putUnsignedByte(target_system);
        
        packet.payload.putUnsignedByte(target_component);
        
        packet.payload.putUnsignedByte(assembly_month);
        
        packet.payload.putUnsignedByte(assembly_day);
        
        packet.payload.putUnsignedByte(assembly_hour);
        
        packet.payload.putUnsignedByte(assembly_minute);
        
        packet.payload.putUnsignedByte(assembly_second);
        
        return packet;
    }

    /**
    * Decode a gimbal_set_factory_parameters message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.magic_1 = payload.getUnsignedInt();
        
        this.magic_2 = payload.getUnsignedInt();
        
        this.magic_3 = payload.getUnsignedInt();
        
        this.serial_number_pt_1 = payload.getUnsignedInt();
        
        this.serial_number_pt_2 = payload.getUnsignedInt();
        
        this.serial_number_pt_3 = payload.getUnsignedInt();
        
        this.assembly_year = payload.getUnsignedShort();
        
        this.target_system = payload.getUnsignedByte();
        
        this.target_component = payload.getUnsignedByte();
        
        this.assembly_month = payload.getUnsignedByte();
        
        this.assembly_day = payload.getUnsignedByte();
        
        this.assembly_hour = payload.getUnsignedByte();
        
        this.assembly_minute = payload.getUnsignedByte();
        
        this.assembly_second = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_gimbal_set_factory_parameters(){
        msgid = MAVLINK_MSG_ID_GIMBAL_SET_FACTORY_PARAMETERS;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_gimbal_set_factory_parameters(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_GIMBAL_SET_FACTORY_PARAMETERS;
        unpack(mavLinkPacket.payload);
    }

                                
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_GIMBAL_SET_FACTORY_PARAMETERS -"+" magic_1:"+magic_1+" magic_2:"+magic_2+" magic_3:"+magic_3+" serial_number_pt_1:"+serial_number_pt_1+" serial_number_pt_2:"+serial_number_pt_2+" serial_number_pt_3:"+serial_number_pt_3+" assembly_year:"+assembly_year+" target_system:"+target_system+" target_component:"+target_component+" assembly_month:"+assembly_month+" assembly_day:"+assembly_day+" assembly_hour:"+assembly_hour+" assembly_minute:"+assembly_minute+" assembly_second:"+assembly_second+"";
    }
}
        