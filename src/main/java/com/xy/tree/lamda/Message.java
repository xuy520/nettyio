package com.xy.tree.lamda;

import java.util.ArrayList;
import java.util.List;

public class Message {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Message(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        List<Message> list = new ArrayList<Message>();
        list.add(new Message("1", "2"));
        list.add(new Message("2", "2"));
        list.add(new Message("3", "3"));
        list.add(new Message("4", "4"));
        list.add(new Message("5", "5"));
        list.stream().filter(m -> m.getId().equals("2")).forEach(m -> {
            System.out.println(m.getId());
        });

    }
}
