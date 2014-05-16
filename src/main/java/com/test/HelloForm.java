package com.test;

import java.io.Serializable;

/**
 * Created by AmarE on 5/16/2014.
 */
public class HelloForm implements Serializable {

    private static final long serialVersionUID = 2827366473382610324L;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
