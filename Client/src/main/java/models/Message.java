package models;

/* 
 * POJO for an Message object
 *
 *   {
    "sequence": "-",
    "timestamp": "_",
    "fromid": "xt0fer",
    "toid": "kristofer",
    "message": "Hello, Kristofer!"
  },

*
 */
public class Message implements Comparable<Message> {
    // sample from server
    // {"sequence":"ea9ccec875bbbbdcca464eb59718ae7cba9def95","timestamp":"2023-08-06T18:45:21.083445025Z",
    // "fromid":"xt0fer","toid":"torvalds","message":"Can you hear me now?!"}
    private String message = "";
    private String toid = "";
    private String fromid = "";
    private String timestamp = "";
    private String sequence = "";

    public Message() {
    }
    public Message (String message, String fromId, String toId, String timestamp, String sequence) {
        this.message = message;
        this.fromid = fromId;
        this.toid = toId;
        this.timestamp = timestamp;
        this.sequence = sequence;
    }
    
    public Message (String message, String fromId, String toId) {
        this.message = message;
        this.fromid = fromId;
        this.toid = toId;
    }

    public Message (String message, String fromId) {
        this.message = message;
        this.fromid = fromId;
        this.toid = "";
    }

    @Override
    public String toString() {
        return "to: " + this.toid + "\nfrom: "+ this.fromid + "\n" + this.message + "\n----\n";
    }

    @Override
    public int compareTo(Message o) {
        return this.sequence.compareTo(((Message) o).getSequence());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToid() {
        return toid;
    }

    public void setToid(String toId) {
        this.toid = toId;
    }

    public String getFromid() {
        return fromid;
    }

    public void setFromid(String fromId) {
        this.fromid = fromId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getSequence() {
        return sequence;
    }
}