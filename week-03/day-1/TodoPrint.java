package com.greenfox.strings;

public class TodoPrint {
    public static void main(String... args){
        String todoText = "My todo:\n" + " - Buy milk\n" + " - Download games\n" + "    - Diablo\n";
        // Add hozzá a "My todo:" szöveget a todoText szövege elejéhez.
        // Add hozzá a " - Download games" szöveget a todoText szöveg végéhez.
        // Add hozzá a " - Diablo" szöveget a todoText szöveg végéhez,
        // de behúzással.

        // Várt eredmény:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
    }
}
