/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE VIP_EVENTS PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
* very important events
*/
public class msg_vip_events extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_VIP_EVENTS = 227;
    public static final int MAVLINK_MSG_ID_VIP_EVENTS_CRC = 86;
    public static final int MAVLINK_MSG_LENGTH = 8;
    private static final long serialVersionUID = MAVLINK_MSG_ID_VIP_EVENTS;


      
    /**
    * timestamp millis
    */
    public long time;
      
    /**
    * type
    */
    public short type;
      
    /**
    * name
    */
    public short name;
      
    /**
    * value
    */
    public short value;
      
    /**
    * sequence
    */
    public short sequence;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_VIP_EVENTS;
        packet.crc_extra = MAVLINK_MSG_ID_VIP_EVENTS_CRC;
              
        packet.payload.putUnsignedInt(time);
              
        packet.payload.putUnsignedByte(type);
              
        packet.payload.putUnsignedByte(name);
              
        packet.payload.putUnsignedByte(value);
              
        packet.payload.putUnsignedByte(sequence);
        
        return packet;
    }

    /**
    * Decode a vip_events message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.time = payload.getUnsignedInt();
              
        this.type = payload.getUnsignedByte();
              
        this.name = payload.getUnsignedByte();
              
        this.value = payload.getUnsignedByte();
              
        this.sequence = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_vip_events(){
        msgid = MAVLINK_MSG_ID_VIP_EVENTS;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_vip_events(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_VIP_EVENTS;
        unpack(mavLinkPacket.payload);
    }

              
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_VIP_EVENTS - sysid:"+sysid+" compid:"+compid+" time:"+time+" type:"+type+" name:"+name+" value:"+value+" sequence:"+sequence+"";
    }
}
        