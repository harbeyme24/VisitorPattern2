class sofa implements Furniture {
    private FurnitureType furnitureType;

    public sofa(FurnitureType furnitureType) {
        this.furnitureType = furnitureType;
    }

    public FurnitureType getFurnitureType() {
        return furnitureType;
    }

  
    public void accept(Shopee shopee) {
        shopee.shop(this);
    }
}