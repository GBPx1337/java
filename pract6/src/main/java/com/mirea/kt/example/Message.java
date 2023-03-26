package com.mirea.kt.example;


import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gbp_a
 */
public class Message implements Serializable{
    private int id;
    private String body;
    private String type;
    private boolean hasAttachments;
    private long timestamp;
    
    private static final long serialVersionUID = -3380157693869190848L;

    public Message(int id, String body, String type, boolean hasAttachments, long timestamp) {
        this.id = id;
        this.body = body;
        this.type = type;
        this.hasAttachments = hasAttachments;
        this.timestamp = timestamp;
    }
/*
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getId());
        out.writeObject(this.getBody());
        out.writeObject(this.getType());
        out.writeObject(this.isHasAttachments());
        out.writeObject(this.getTimestamp());
    }


    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.id = (Integer)in.readObject();
        this.body = (String)in.readObject();
        this.type = (String)in.readObject();
        this.hasAttachments = (Boolean)in.readObject();
        this.timestamp = (Long)in.readObject();
    }
*/
    @Override
    public String toString() {
        return "Message{" + "id=" + id + ", body=" + body + ", type=" + type + ", hasAttachments=" + hasAttachments + ", timestamp=" + timestamp + '}';
    } 

    public void setId(int id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHasAttachments(boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getType() {
        return type;
    }

    public boolean isHasAttachments() {
        return hasAttachments;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

}
