class furnitureShippingCost implements lazada {

    public void shop(chair chair) {
        int lightweight = 25;
        int flatShippingRate = lightweight * 200 / 10; 
        System.out.println("The price shipping of the chair: PHP" + flatShippingRate);
    }


    public void shop(table table) {
        int minVal = 10000;
        int flatShippingRate = minVal * 15 / 100; 
        System.out.println("The price shipping of the table: PHP" + flatShippingRate);
    }

    public void shop(sofa sofa) {
        int minVal = 600;
        int flatShippingRate = 2500 * 2; 
        System.out.println("The price shipping of the sofa: PHP" + flatShippingRate);
    }
}