package seclab.testprojects.jxpathvuln.repository;

import seclab.testprojects.jxpathvuln.data.Goose;
import seclab.testprojects.jxpathvuln.xpath.GeeseXPathFinder;

public class GeeseRepository {
    private final Goose goose = new Goose("Bruce", 75);

    public Object find(String value) {
        GeeseXPathFinder gooseXPathFinder = new GeeseXPathFinder(goose);
        return gooseXPathFinder.findInGaggle(value);
    }

}
