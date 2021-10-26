package com.gihub;

public class Gadget {
    private String gadgetName;
    private String gadgetType;
    private String brandName;
    private int gadgetCount;
    private float price;

    public Gadget(String gadgetName, String gadgetType, String brandName, int gadgetCount, float price) {
        this.gadgetName = gadgetName;
        this.gadgetType = gadgetType;
        this.brandName = brandName;
        this.gadgetCount = gadgetCount;
        this.price = price;
    }

    public String getGadgetName() {
        return gadgetName;
    }

    public void setGadgetName(String gadgetName) {
        this.gadgetName = gadgetName;
    }

    public String getGadgetType() {
        return gadgetType;
    }

    public void setGadgetType(String gadgetType) {
        this.gadgetType = gadgetType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getGadgetCount() {
        return gadgetCount;
    }

    public void setGadgetCount(int gadgetCount) {
        this.gadgetCount = gadgetCount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
