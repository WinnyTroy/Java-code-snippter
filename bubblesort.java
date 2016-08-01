//Write a java algorithm that implements the threesort.


public static void BubbleSort( int [ ] num ){
     int q

 // set the flag to true to begin first pass
     boolean flag = true;  

 //holding variable
     int temp;  
    while ( flag )
     {

//Step 1: set flag to false awaiting a possible swap
            flag= false;   
//Loop through the algorithm
            for( q=0;  q < num.length -1;  q++ )
            {
            // change to > for ascending sort
                   if ( num[ q ] < num[q+1] )   
                   {

                          //change positioning of elements 
                           temp = num[ q ];              
                           num[ q ] = num[ q+1 ];
                           num[ q+1 ] = temp;
                   //shows a swap occurred
                          flag = true;              
                  }
            }
      }

}
