package campusAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.uniport.www.uniportmobile.CampusTour;
import com.uniport.www.uniportmobile.R;

/**
 * Created by INNOVATIONIST-PC on 3/14/2015.
 */
public class CampusTourListAdapter extends BaseAdapter {

    String [] locationDescription;
    String [] locationDescriptionDetails;
    int[] thumbNailImg;
    Context context;
    private static LayoutInflater layoutInflater;

    public CampusTourListAdapter (CampusTour campusTour, String [] locationDescriptionNew, String [] locationDescriptionDetailsNew, int[] thumbNailImgNew){

        context = campusTour;
        this.locationDescription = locationDescriptionNew;
        this.locationDescriptionDetails = locationDescriptionDetailsNew;
        this.thumbNailImg = thumbNailImgNew;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);



    }

    @Override
    public int getCount() {
        return locationDescription.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class allHolder{

        TextView locationTitle;
        TextView locationDetails;
        ImageView thumbNailBoldImg;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        allHolder holder = new allHolder();
        View campusItem;
        campusItem = layoutInflater.inflate(R.layout.campus_tour_list_row_items,null) ;

        holder.locationTitle = (TextView) campusItem.findViewById(R.id.tourHeadline);
        holder.locationDetails = (TextView) campusItem.findViewById(R.id.tourDescriptionText);
        holder.thumbNailBoldImg = (ImageView) campusItem.findViewById(R.id.list_image3);

        holder.locationTitle.setText(locationDescription[position]);
        holder.locationDetails.setText(locationDescriptionDetails[position]);
        holder.thumbNailBoldImg.setImageResource(thumbNailImg[position]);
        return campusItem;
    }
}
