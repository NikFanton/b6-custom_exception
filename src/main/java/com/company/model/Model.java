package com.company.model;

import com.company.model.entity.Record;

/**
 * Created by Nikita Guchenko on 18.03.2018.
 */
public class Model {
    public void addRecord(Record record) throws LoginAlreadyExists {
        for (DataBaseStub rec : DataBaseStub.values()) {
            if (rec.getRecord().getLogin().equals(record.getLogin())) {
                throw new LoginAlreadyExists("Login " + record.getLogin() + " already exists");
            }
        }
    }
}
