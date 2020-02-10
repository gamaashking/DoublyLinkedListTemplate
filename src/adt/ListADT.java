/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 10/02/20
 *   Time: 5:21 PM
 */

package adt;

/**
 * This is the Interface for the List ADT.
 * This will serve as the template for the Doubly-Linked List.
 */
public interface ListADT<E> {
    /**
     * This method will add the item in the list.
     *
     * @param item the item to be added in the list.
     * @return true when the item adds to the list.
     */
    boolean add(E item);

    /**
     * This method will remove an item from the linked list.
     *
     * @return the "data" of the node removed from the end of the 'Doubly-Linked List'.
     */
    E remove();

    /**
     * This method will search an item in the list.
     *
     * @param item the item to be searched inside the list.
     * @return the assumed 'index' at which the item was found in the linked list.
     */
    int search(E item);

    void sort();
}
