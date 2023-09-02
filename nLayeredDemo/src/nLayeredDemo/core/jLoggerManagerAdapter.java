package nLayeredDemo.core;
import nLayeredDemo.jLogger.jLoggerManagger;

public class jLoggerManagerAdapter implements LoggerService{
    @Override
    public void logToSystem(String message) {
        jLoggerManagger managger = new jLoggerManagger();
        managger.log(message);





    }
}
