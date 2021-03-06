/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE USER_STATUS PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
* prearm error flag
*/
public class msg_user_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_USER_STATUS = 229;
    public static final int MAVLINK_MSG_ID_USER_STATUS_CRC = 145;
    public static final int MAVLINK_MSG_LENGTH = 9;
    private static final long serialVersionUID = MAVLINK_MSG_ID_USER_STATUS;


      
    /**
    * timestamp millis
    */
    public long time;
      
    /**
    * 
    */
    public float voltage;
      
    /**
    * 
    */
    public short lequidlevel;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_USER_STATUS;
        packet.crc_extra = MAVLINK_MSG_ID_USER_STATUS_CRC;
              
        packet.payload.putUnsignedInt(time);
              
        packet.payload.putFloat(voltage);
              
        packet.payload.putUnsignedByte(lequidlevel);
        
        return packet;
    }

    /**
    * Decode a user_status message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.time = payload.getUnsignedInt();
              
        this.voltage = payload.getFloat();
              
        this.lequidlevel = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_user_status(){
        msgid = MAVLINK_MSG_ID_USER_STATUS;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_user_status(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_USER_STATUS;
        unpack(mavLinkPacket.payload);
    }

          
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_USER_STATUS - sysid:"+sysid+" compid:"+compid+" time:"+time+" voltage:"+voltage+" lequidlevel:"+lequidlevel+"";
    }
}
        