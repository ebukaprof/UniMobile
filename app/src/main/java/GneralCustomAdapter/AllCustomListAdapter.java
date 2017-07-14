package GneralCustomAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.uniport.www.uniportmobile.R;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class AllCustomListAdapter extends BaseAdapter {

    private String [] mainText001;
    private Context conText;

    public AllCustomListAdapter ( Context c, String[] mainText0012){

         conText = c;
        this.mainText001 = mainText0012;

    }

    @Override
    public int getCount() {
        return mainText001.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listes;

        LayoutInflater layoutInflaterList = (LayoutInflater) conText.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
         listes = new View(conText);
            listes = layoutInflaterList.inflate(R.layout.all_list_about_items, null);
            TextView textView = (TextView) listes.findViewById(R.id.BigTextHere);
            textView.setText(mainText001[position]);
        }else {
            listes = (View) convertView;
        }
        return listes;
    }
}
