package customGridAll;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.uniport.www.uniportmobile.R;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class CustomGridAllToday extends BaseAdapter {

    private String [] mainText0013;
    private int[] imageIdC;
    private Context conText;

    public CustomGridAllToday ( Context c, String[] mainText00123,int [] imageIdC2){

        conText = c;
        this.mainText0013 = mainText00123;
        this.imageIdC =imageIdC2;

    }

    @Override
    public int getCount() {
        return mainText0013.length;
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
        View listes2;

        LayoutInflater layoutInflaterList = (LayoutInflater) conText.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            listes2 = new View(conText);
            listes2 = layoutInflaterList.inflate(R.layout.all_gird_view_marietu, null);
            TextView textView = (TextView) listes2.findViewById(R.id.textViewAll);
            ImageView imageView = (ImageView) listes2.findViewById(R.id.imageViewAll);
            imageView.setImageResource(imageIdC[position]);
            textView.setText(mainText0013[position]);
        }else {
            listes2 = (View) convertView;
        }
        return listes2;
    }
}
