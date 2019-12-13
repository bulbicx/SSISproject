/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@author Marco Castellana
 * @author Simone Agus
 */
public class SSinfo {
    
    public int sofaId;
    public String sofaName;
    public String colour;
    public int price;
    public String category;
    
    public SSinfo (int sofaId, String sofaName, String colour, int price, String category) {
        this.sofaId = sofaId;
        this.sofaName = sofaName;
        this.colour = colour;
        this.price = price;
        this.category = category;
    }

    public int getSofaId() {
        return sofaId;
    }

    public String getSofaName() {
        return sofaName;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setSofaId(int sofaId) {
        this.sofaId = sofaId;
    }

    public void setSofaName(String sofaName) {
        this.sofaName = sofaName;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
}
