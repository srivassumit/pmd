package net.sourceforge.pmd.jdeveloper;

import net.sourceforge.pmd.RuleViolation;

public class RuleViolationWrapper {

    private RuleViolation ruleViolation;

    public RuleViolationWrapper(RuleViolation ruleViolation) {
        this.ruleViolation = ruleViolation;
    }

    public RuleViolation getRuleViolation() {
        return this.ruleViolation;
    }

    public String toString() {
        return ruleViolation.getFilename() + " : " + ruleViolation.getLine() +" : "+ ruleViolation.getDescription();
    }
}
