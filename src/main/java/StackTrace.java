import java.util.ArrayList;
import java.util.List;

public class StackTrace {
    public String firstLine;
    public List<StackTraceElement> stackLines;

    public StackTrace() {
        this.stackLines = new ArrayList<StackTraceElement>();
    }
}
