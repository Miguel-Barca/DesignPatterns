package org.pluralsight.builder;

public class LunchOrderTelescopic {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderTelescopic (String bread) {
        this.bread = bread;
    }

    public LunchOrderTelescopic (String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderTelescopic (String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrderTelescopic (String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
