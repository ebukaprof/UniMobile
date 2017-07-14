package custom_nails_all;

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
public class ThumbNailsAdapter extends BaseAdapter {

    private String [] mainTextHead;
    private String [] mainTextDesc;
    private int [] thumbNailsImageId;
    private Context conText;

    public ThumbNailsAdapter ( Context c, String[] mainTextHead1, String[] mainTextDesc1, int []thumbNailsImageId1){

        conText = c;
        this.mainTextHead = mainTextHead1;
        this.mainTextDesc = mainTextDesc1;
        this.thumbNailsImageId = thumbNailsImageId1;

    }

    @Override
    public int getCount() {
        return mainTextHead.length;
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
        View listes0;

        LayoutInflater layoutInflaterList = (LayoutInflater) conText.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            listes0 = new View(conText);
            listes0 = layoutInflaterList.inflate(R.layout.thumbnail_list_row, null);
            TextView textView = (TextView) listes0.findViewById(R.id.libraryHeadline);
            TextView viewText = (TextView) listes0.findViewById(R.id.libraryDescriptionText);
            ImageView imageView202 = (ImageView) listes0.findViewById(R.id.list_image677);

            textView.setText(mainTextHead[position]);
            viewText.setText(mainTextDesc[position]);
            imageView202.setImageResource(thumbNailsImageId[position]);
        }else {
            listes0 = (View) convertView;
        }
        return listes0;
    }
}



