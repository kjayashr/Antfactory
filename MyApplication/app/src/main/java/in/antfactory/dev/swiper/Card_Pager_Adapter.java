package in.antfactory.dev.swiper;

import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krishnakanth on 9/8/2016.
 */
public class Card_Pager_Adapter extends PagerAdapter {

    public Card_Pager_Adapter ()
    {

    }
    private List<Information> array_items = new ArrayList<>();
    @Override
    public Object instantiateItem(ViewGroup container,int position)
    {

        View view = LayoutInflater.from(container.getContext())
                .inflate(R.layout.card_layout,container,false);
         // initializing text box.
        TextView text_box_name = (TextView) view.findViewById(R.id.textboxname);
        String item_1 = array_items.get(position).name;
         text_box_name.setText(item_1);


        TextView text_box_desc = (TextView) view.findViewById(R.id.textboxdesc);
       // TextView textbox_desc = (TextView) view.findViewById(R.id.textboxname);
        String item_2 = array_items.get(position).description;
        text_box_desc.setText(item_2);

        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return array_items.size();
    }
    @Override
    public void destroyItem(ViewGroup container,int position,Object object)
    {
        container.removeView((View)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    public void addAll(List<Information> items)
    {
        array_items = new ArrayList<>(items);
    }
}
