package com.company;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Dosyaya Loglandı : " + message);
    }
}
