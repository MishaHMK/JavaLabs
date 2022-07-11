package com.Logging;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Log {
    private Logger logger;
    private FileHandler handler;

    public Log(String filename) throws SecurityException,IOException {
        File file = new File(filename);
        if(!file.exists()) {
            file.createNewFile();
            logger.setUseParentHandlers(false);
        }
        handler = new FileHandler(filename, true);
        logger = Logger.getLogger("Logger");
        logger.addHandler(handler);
        handler.setFormatter(new SimpleFormatter());
    }

    public Logger getLogger(){ return logger; }
}
