package seclab.testprojects.jxpathvuln.xpath;

import seclab.testprojects.jxpathvuln.data.Goose;

public class GeeseXPathFinder extends AbstractXPathFinder<Goose> {

    public GeeseXPathFinder(Goose goose) {
        data = goose;
    }

    public Object findInGaggle(String path) { // a gaggle is a group of geese
        return findWithXPath(path);
    }

}
