package com.kreitek.editor.Format;

import com.kreitek.editor.BadFormatException;

public class SelectionFormat {

    public Object getFormat(String type) throws BadFormatException {
        switch (type){
            case "text":
                return new TextFormat();
            case "json":
                return new JsonFormat();
            default:
                throw new BadFormatException();
        }
    }
}
