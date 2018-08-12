package tools.dynamia.zk.addons.chartjs;

public class ChartjsException extends RuntimeException{

    public ChartjsException() {
    }

    public ChartjsException(String message) {
        super(message);
    }

    public ChartjsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChartjsException(Throwable cause) {
        super(cause);
    }
}
