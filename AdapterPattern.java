interface PrintTarget {
    void print();
}

class MessagePrinter {
    public void showMessage() {
        System.out.println("MessagePrinter: Showing message.");
    }
}

class PrintAdapter implements PrintTarget {
    private MessagePrinter messagePrinter;

    public PrintAdapter(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    @Override
    public void print() {
        messagePrinter.showMessage();
    }
}

public class AdapterPattern {
    public static void run() {
        MessagePrinter printer = new MessagePrinter();
        PrintTarget adapter = new PrintAdapter(printer);
        adapter.print();
    }
}
