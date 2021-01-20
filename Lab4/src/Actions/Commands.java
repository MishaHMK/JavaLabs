package Actions;

public class Commands {
    private final Command PresentInfo;
    private final Command Search;
    private final Command Sort;

    public Commands(Command PresentInfo, Command Search, Command Sort) {
        this.PresentInfo = PresentInfo;
        this.Search = Search;
        this.Sort = Sort;

    }

    public void PresentInfo() {
        PresentInfo.execute();
    }
    public void Search() { Search.execute(); }
    public void Sort() {
        Sort.execute();
    }
}
