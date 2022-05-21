// prova
package it.unipd.mtss;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

package it.unipd.mtss.business;

import java.util.List;

import it.unipd.mtss.business.exception.BillException;


import it.unipd.mtss.model.MenuItem;

public interface Bill {
    double getOrderPrice(List<EItem> itemsOrdered, User user) throws
            RestaurantBillException;
}