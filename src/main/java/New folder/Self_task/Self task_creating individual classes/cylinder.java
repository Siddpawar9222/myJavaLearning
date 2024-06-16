package com.codewithharry.shape;
public class cylinder extends dimensions {
    cylinder(int dim1,int dim2)
    {
        super(dim1, dim2);
    }
    public double area()
    {
        return (2*Math.PI*(this.dim1))*(this.dim1 + this.dim2);
    }
}
