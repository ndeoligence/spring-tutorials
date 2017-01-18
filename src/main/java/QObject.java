import java.util.LinkedList;
import java.util.List;

/**
 * Created by phoenix on 12/28/16.
 */
public class QObject {
    private QObject parent = null;
    private List<QObject> children = new LinkedList<>();
    public QObject() {}
    public QObject(QObject parent) {
        this.parent = parent;
    }
    public QObject(QObject parent, QObject... children) {
        this.parent = parent;
        for (QObject child : children)
            this.children.add(child);
    }

    public QObject getParent() {
        return parent;
    }

    public void setParent(QObject parent) {
        this.parent = parent;
    }

    public List<QObject> getChildren() {
        return children;
    }

    public boolean addChild(QObject child) {
        return children.add(child);
    }

    public boolean removeChild(QObject child) {
        return children.remove(child);
    }
}
