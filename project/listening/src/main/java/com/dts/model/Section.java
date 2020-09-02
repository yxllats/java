package com.dts.model;

public class Section {
    public int sid;
    public String name;
    // uuid 就是保存声音的 uuid
    public String uuid;

    public Section() {
    }

    public Section(int sid, String uuid, String name) {
        this.sid = sid;
        this.uuid = uuid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Section{" +
                "uuid='" + uuid + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
