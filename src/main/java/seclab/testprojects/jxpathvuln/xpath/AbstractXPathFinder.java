package seclab.testprojects.jxpathvuln.xpath;

import org.apache.commons.jxpath.JXPathContext;

public abstract class AbstractXPathFinder<T> {
    T data;

    Object findWithXPath(String path) {
        var pathContext = JXPathContext.newContext(data);
        return pathContext.getValue(path);
    }
}
