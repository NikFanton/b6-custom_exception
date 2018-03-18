package com.company.controller;

/**
 * Created by student on 26.09.2017.
 */
public interface RegexContainer {
    // Cyrillic name
    String REGEX_NAME_UKR = "^[А-ЯІЇЄ][а-яіїє']{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "^[A-Za-z ,.'-]+$";

    String REGEX_EMAIL_LAT = "^([A-Za-z0-9!#$%&'*+/=?^_`{|}~.-])*([A-Za-z0-9!#$%&'*+/=?^_`{|}~-])+@[a-z0-9_-]+\\.[a-z0-9_-]{2,5}$";

    String REGEX_LOGIN_LAT = "^[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]{3,20}$";

    String REGEX_PHONE_NUMBER = "^\\+?\\d?\\d?\\(?\\d{3}\\)?[-.]?\\d{3}[-.]?\\d{2}[-.]?\\d{2}$";
}
