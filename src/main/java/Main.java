import java.time.*;
public class Main {
    private static final String INSTANCE = "EncodingHelper_175742";
    public static String generateId() { return INSTANCE + "-" + Instant.now().toEpochMilli(); }
    public static void main(String[] args) { String id = generateId(); System.out.println("[" + INSTANCE + "] ID: " + id); System.out.println("[" + INSTANCE + "] Time: " + LocalDateTime.now()); System.out.println("[" + INSTANCE + "] Zone: " + ZoneId.systemDefault()); }
}
