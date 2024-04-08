package com.codewithharry.shape;

public class square extends dimensions {
    square(int dim1 , int dim2)
    {
        super(dim1 , dim2);
    }
    public int area()
    {
        return this.dim1*this.dim2;
    }
    
}
