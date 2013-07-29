package AbstractFactory_Sample.tablefactory;
import AbstractFactory_Sample.factory.Factory;
import AbstractFactory_Sample.factory.Link;
import AbstractFactory_Sample.factory.Page;
import AbstractFactory_Sample.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
