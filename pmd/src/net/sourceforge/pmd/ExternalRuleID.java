/*
 * User: tom
 * Date: Jul 9, 2002
 * Time: 2:52:07 PM
 */
package net.sourceforge.pmd;

public class ExternalRuleID {

    private String filename;
    private String ruleName;

    public ExternalRuleID(String id) {
        int afterXML = id.indexOf(".xml") + 5;
        if (afterXML >= id.length()) {
            throw new RuntimeException("Unable to parse reference to external rule " + id +".  These references need to be in the form <rulesetname>/<rulename>, i.e., <rule ref=\"rulesets/unusedcode.xml/UnusedPrivateField\"/>");
        }
        filename = id.substring(0, afterXML-1);
        ruleName = id.substring(afterXML);
    }

    public String getFilename() {
        return filename;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String toString() {
        return filename + "/" + ruleName;
    }
}
