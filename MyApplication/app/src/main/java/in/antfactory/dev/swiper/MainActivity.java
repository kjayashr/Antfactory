package in.antfactory.dev.swiper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //initializing list view
        ListView view_of_list = (ListView) findViewById(R.id.listview);

    //initializing adapter
        ArrayAdapter<String> adapter_of_titles = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        for(homepage_lists enum_of_lists: homepage_lists.values())
        {
            adapter_of_titles.add(getString(enum_of_lists.title));
        }

        view_of_list.setAdapter(adapter_of_titles);
    //Item listner
        view_of_list.setOnItemClickListener(this);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       homepage_lists item_of_list = homepage_lists.values()[position];
        switch(item_of_list){

            case Choice1:
                Intent intent_card = new Intent(MainActivity.this,Card.class);
                startActivity(intent_card);
                break;
            case Choice2:
                Intent intent_course = new Intent(MainActivity.this,Course.class);
                startActivity(intent_course);
                break;
            case Choice3:
                Intent intent_about = new Intent(MainActivity.this,About.class);
                startActivity(intent_about);
                break;
        }


    }
}
