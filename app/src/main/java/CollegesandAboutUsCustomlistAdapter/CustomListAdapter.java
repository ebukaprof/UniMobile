package CollegesandAboutUsCustomlistAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.uniport.www.uniportmobile.AboutUni;
import com.uniport.www.uniportmobile.CampusTour;
import com.uniport.www.uniportmobile.CollegesFaculties;
import com.uniport.www.uniportmobile.R;

/**
 * Created by INNOVATIONIST-PC on 3/15/2015.
 */
public class CustomListAdapter extends BaseAdapter {

    String [] mainText;
    private LayoutInflater inflaterFac;
    Context context;

    public CustomListAdapter (CollegesFaculties campusTour,  String [] mainTextNew){

        context = campusTour;
        this.mainText = mainTextNew;
        inflaterFac = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return mainText.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class theirHolder{

        TextView mainText2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        theirHolder holder2 = new theirHolder();
        View bigTextView;
        bigTextView =inflaterFac.inflate(R.layout.college_faculties_list_rows,null);

        holder2.mainText2 = (TextView) bigTextView.findViewById(R.id.collegeHeadline);
        holder2.mainText2.setText(mainText[position]);


        return bigTextView;
    }
}
