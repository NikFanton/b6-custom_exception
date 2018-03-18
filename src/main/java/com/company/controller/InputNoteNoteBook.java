package com.company.controller;

import com.company.model.entity.Record;
import com.company.view.View;

import java.util.Scanner;

import static com.company.controller.RegexContainer.*;
import static com.company.view.TextConstant.*;

/**
 * Created by student on 26.09.2017.
 */
public class InputNoteNoteBook {
    private View view;
    private Scanner sc;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public Record inputRecord () {
        Record record = new Record();
        UtilityController utilityController = new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        record.setFirstName(utilityController.inputStringValueWithScanner(FIRST_NAME, str));
        record.setLogin(utilityController.inputStringValueWithScanner(LOGIN, REGEX_LOGIN_LAT));
        return record;
    }
}
