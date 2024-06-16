package com.codewithharry.shape;
public class sphere extends dimensions {
    sphere(int dim1)
    {
        super(dim1, -1);
    }
    public double area()
    {
        return 4*Math.PI*this.dim1*this.dim1;
    }
    
}
