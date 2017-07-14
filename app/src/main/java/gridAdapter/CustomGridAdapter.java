package gridAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.uniport.www.uniportmobile.MainActivity;
import com.uniport.www.uniportmobile.R;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

/**
 * Created by INNOVATIONIST-PC on 3/13/2015.
 */
public class CustomGridAdapter extends BaseAdapter {

    String [] school;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater ;

    public CustomGridAdapter(MainActivity mainActivity,String[] schools,int[] imageIdNew){

        context = mainActivity;
        this.imageId = imageIdNew;
        this.school = schools;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return school.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder{
        TextView textView;
        ImageView imageView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder = new Holder();
        View rowView;


      rowView = inflater.inflate(R.layout.gridlist,null);
        holder.textView = (TextView) rowView.findViewById(R.id.textView1);
        holder.imageView = (ImageView) rowView.findViewById(R.id.imageView1);

        holder.textView.setText(school[position]);
        holder.imageView.setImageResource(imageId[position]);


        return rowView;
    }
}
