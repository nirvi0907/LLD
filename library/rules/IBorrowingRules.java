package library.rules;

public interface IBorrowingRules {
    public boolean isMaxBookReached();
    public void updateMaxBooks(int maxBooks);
}
