package com.gihub;

public class Main {

    public static void main(String[] args) {
	Gadget myGadgets = new Gadget("apple watch", "Watch", "Apple iOS", 2, 299.99F);
	Gadget grishGadgets = new Gadget("Samsung Sten", "phone", "Samsung", 1, 1099.99F);

        System.out.println("Muskan is an " + myGadgets.getBrandName() + " customer.");

    }
}
