package controllers;

import models.Id;
import models.Message;

import java.util.List;

public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";
    private MessageController msgCtrl;
    private IdController idCtrl;

    public TransactionController(MessageController m, IdController j) {
        msgCtrl = m;
        idCtrl = j;
    }

    public List<Id> getIds() {
        return idCtrl.getIds();
    }

    public String getId(String id) {
        return null;
    }
    public String putId(String id) {
        return null;
    }

    public String deleteId(String id) {
        return null;
    }

    public String postId(String idtoRegister, String githubName) {
        // Id tid = new Id(idtoRegister, githubName);
        // tid = idCtrl.postId(tid);
        // return ("Id registered.");
        return null;
    }

    public List<Message> getMessages() {
        return msgCtrl.getMessages();
    }
}
