package customListAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.uniport.www.uniportmobile.R;
import com.uniport.www.uniportmobile.UniNews;

/**
 * Created by INNOVATIONIST-PC on 3/14/2015.
 */
public class CustomListViewAdapter extends BaseAdapter{

    String [] headlineText;
    String [] descriptionText;
    Context context;
    int [] newsImg;
    private static LayoutInflater inflater ;

    public CustomListViewAdapter (UniNews uniNews, String [] headlineTextNew, String [] descriptionTextNew , int [] newsImgNew){

       context = uniNews;
        this.headlineText = headlineTextNew;
        this.descriptionText =descriptionTextNew;
        this.newsImg = newsImgNew;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }

    @Override
    public int getCount() {
        return headlineText.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class iHoldEverything{
        TextView newsHeadlineText;
        TextView newsDescriptionText;

        ImageView boldThumbnailImage;



    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        iHoldEverything holdEverything = new iHoldEverything();
        View listItemsView;
        listItemsView = inflater.inflate(R.layout.list_row_items,null);

        holdEverything.newsHeadlineText = (TextView) listItemsView.findViewById(R.id.newsHeadlineText);
        holdEverything.newsDescriptionText = (TextView) listItemsView.findViewById(R.id.newsDescriptionText);
        holdEverything.boldThumbnailImage = (ImageView) listItemsView.findViewById(R.id.list_image);

        holdEverything.newsHeadlineText.setText(headlineText[position]);
        holdEverything.newsDescriptionText.setText(descriptionText[position]);
        holdEverything.boldThumbnailImage.setImageResource(newsImg[position]);

        return listItemsView;
    }
}
