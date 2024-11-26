package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lexer {
    public enum TokenType {
        VARIABLE, ASSIGN, INTEGER, PRINT, SCOPE_OPEN, SCOPE_CLOSE, EOF
    }

    public static class Token{
        TokenType type;
        String value;

        public Token(TokenType type, String value) {
            this.type = type;
            this.value = value;
        }

        @Override
        public String toString() {
            return type + (value != null ? " (" + value + ")" : "");
        }
    }

    private final String input;
    private int pos;

    public Lexer(String input) {
        this.input = input;
        this.pos = 0;
    }

}
