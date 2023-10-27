public interface MouseHandler {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
}

public interface WindowHandler {
    void windowClosing();
    void windowClosed();
}

public class WindowGUIApp implements MouseHandler, WindowHandler {
    public void mouseClicked() {
        System.out.println("Mouse clicked");
    }

    public void mousePressed() {
        System.out.println("Mouse pressed");
    }

    public void mouseReleased() {
        System.out.println("Mouse released");
    }

    public void windowClosing() {
        System.out.println("Window closing");
    }

    public void windowClosed() {
        System.out.println("Window closed");
    }
}

public class GUIDemo {
    public static void main(String[] args) {
        WindowGUIApp app = new WindowGUIApp();

        // Invoke methods from both interfaces
        app.mouseClicked();
        app.mousePressed();
        app.mouseReleased();
        app.windowClosing();
        app.windowClosed();
    }
}
