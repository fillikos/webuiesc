package de.fillikos.rf2.esctool.grid.webui;

import java.util.ArrayList;
import java.util.List;

public class Standings {

    public ArrayList<User> users;

    public Standings() {
        users = new ArrayList();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

}
