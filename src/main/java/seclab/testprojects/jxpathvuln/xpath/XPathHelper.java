package seclab.testprojects.jxpathvuln.xpath;

import org.apache.commons.jxpath.JXPathContext;

public class XPathHelper {

    private final JXPathContext context;

    public XPathHelper(JXPathContext context) {
        this.context = context;
    }

    public String getFirstName() {
        return (String)context.getValue("firstName");
    }

    public String getHomeCityName() {
        var pathExpression = "addresses/home/city";
        return (String)context.getValue(pathExpression);
    }

    public String pathAdjuster(String path) { //
        StringBuilder pathAjusted = new StringBuilder(path);
        return pathAjusted.toString().replace("@", "");
    }
}
