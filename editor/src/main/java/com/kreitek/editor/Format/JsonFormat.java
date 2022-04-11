package com.kreitek.editor.Format;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class JsonFormat implements FactoryFormat {

    public Format showDocumentLines(@NotNull ArrayList<String> lines) {
        if (lines.size() > 0){
            printLnToConsole(" \"doc\":[");
            for (int index = 0; index < lines.size(); index++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  {\"line\":\"");
                stringBuilder.append(index);
                stringBuilder.append("\",\"text\":\"");
                stringBuilder.append(lines.get(index));
                stringBuilder.append("\"}");
                if(index < lines.size()-1){
                    stringBuilder.append(",");
                }
                printLnToConsole(stringBuilder.toString());
            }
            printLnToConsole(" ]");
        }
        return null;
    }

    private void printLnToConsole(String message) {
        System.out.println(message);
    }
}
