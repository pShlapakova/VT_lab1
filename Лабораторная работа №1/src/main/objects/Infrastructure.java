package main.objects;

abstract class Infrastructure {
    private String name;
    private int buildPrice;
    private int timeToRepair;
    private Territory territory;

    public Infrastructure() {
        name = "";
        buildPrice = 0;
        timeToRepair = Integer.MAX_VALUE;
        territory = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            this.name = "";
        else
            this.name = name;
    }

    public int getBuildPrice() {
        return buildPrice;
    }

    public void setBuildPrice(int priceBuild) {
        if (priceBuild > 0)
            this.buildPrice = priceBuild;
    }

    public int getTimeToRepair() {
        return timeToRepair;
    }

    public void setTimeToRepair(int timeToRepair) {
        this.timeToRepair = timeToRepair;
    }

    public Territory getTerritory() {
        return territory;
    }

    public void setTerritory(Territory territory) {
        this.territory = territory;
    }

    public void build(Territory territory) {
        this.territory = territory;
        System.out.println("Build " + name);
    }

    public void destroy() {
        this.territory = null;
        System.out.println("Destroy " + name);
    }
}
