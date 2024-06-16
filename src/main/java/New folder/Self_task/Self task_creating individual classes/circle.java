package com.codewithharry.shape;
public class circle extends dimensions {
    circle(int dim1)
    {
        super(dim1, -1);
    }
    public double area(){
        return Math.PI*this.dim1*this.dim1;
    }
    
}
