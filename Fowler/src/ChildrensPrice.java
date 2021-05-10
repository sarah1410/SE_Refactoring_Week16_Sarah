/**
 * Created with IntelliJ IDEA.
 * User: Berkling
 * Date: 14.05.14
 * Time: 12:48
 * To change this template use File | Settings | File Templates.
 */
public class ChildrensPrice implements Price {


    public int getPriceCode(){
        return Movie.CHILDRENS;
    }

    public double getCharge(int daysRented){
         if (daysRented > 3) return (daysRented - 3 ) * 1.5;
           else return 1.5;
    }

    /*
     * this method doesn't make sense in that way
     */
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}

