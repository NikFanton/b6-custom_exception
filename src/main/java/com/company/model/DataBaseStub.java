package com.company.model;

import com.company.model.entity.Record;

public enum DataBaseStub {
    PERSON_FIRST(new Record("Nikita", "niklog")),
    PERSON_SECOND(new Record("Jenifer", "login")),
    PERSON_THIRD(new Record("Max", "login1337")),
    PERSON_FORTH(new Record("Nastia", "biglogin")),
    PERSON_FIFTH(new Record("Peter", "abc"));

    DataBaseStub(Record record) {
        this.record = record;
    }

    private Record record;

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
}
