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
    
    public String sofaId;
    public String sofaName;
    public String category;
    public String colour;
    public int price;

    public SSinfo(String sofaId, String sofaName, String category, String colour, int price) 
    {
        this.sofaId = sofaId;
        this.sofaName = sofaName;
        this.category = category;
        this.colour = colour;
        this.price = price;
    }

    public String getSofaId()
    {
        return sofaId;
    }

    public String getSofaName() 
    {
        return sofaName;
    }

    public String getCategory() 
    {
        return category;
    }

    public String getColour()
    {
        return colour;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setSofaId(String sofaId) 
    {
        this.sofaId = sofaId;
    }

    public void setSofaName(String sofaName) 
    {
        this.sofaName = sofaName;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public void setColour(String colour) 
    {
        this.colour = colour;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }  
    
}
