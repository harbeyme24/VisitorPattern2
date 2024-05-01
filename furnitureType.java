class furnitureType implements furniture {
    private String furniture;

    public furnitureType(String furniture) {
        this.furniture = furniture; 
    }

    public String getType() {
        return furniture;
    }

    public void accept(lazada shopee) {
        if (furniture.equals("Chairs")) {
            shopee.shop(new Chair(this));
        } else if (furniture.equals("Tables")) {
            shopee.shop(new Table(this));
        } else if (furniture.equals("Sofas")) {
            shopee.shop(new Sofa(this));
        }
    }
}