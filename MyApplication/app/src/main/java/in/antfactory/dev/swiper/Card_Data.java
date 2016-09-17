package in.antfactory.dev.swiper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krishnakanth on 9/8/2016.
 */
public class Card_Data {
   private Card_Data(){
       //constructor
   }

    public static List<Information> load_all_item()
    {
        List<Information> items = new ArrayList<>();

        Information item_information1 = new Information();
        item_information1.name = "Item #1";
        item_information1.description = "Item Desc";
        items.add(item_information1);

        Information item_information2 = new Information();
        item_information2.name = "Item #2";
        item_information2.description = "Item 2 Desc";
        items.add(item_information2);


        return items;
    }
}
