package AbstractFactory_Sample.listfactory;
import AbstractFactory_Sample.factory.Factory;
import AbstractFactory_Sample.factory.Link;
import AbstractFactory_Sample.factory.Page;
import AbstractFactory_Sample.factory.Tray;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
