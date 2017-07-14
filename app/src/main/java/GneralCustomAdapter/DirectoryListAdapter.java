package GneralCustomAdapter;

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
public class DirectoryListAdapter extends BaseAdapter {

    private String [] nameOfLecturers;
    private String [] emails;
    private String [] phoneNumb;
    private String [] designations;
    private String [] departments;

    private int [] lecturerImageId;
    private Context context1;

    public DirectoryListAdapter ( Context c, String[] nameOfLecturersNew, String[] emailNew, String[] phoneNew,String[] TitleNew,String[] departmentNew ,int [] lecturerImageIdNew){

        context1 = c;
        this.nameOfLecturers = nameOfLecturersNew;
        this.emails = emailNew;
        this.phoneNumb = phoneNew;
        this.designations = TitleNew;
        this.departments = departmentNew;
        this.lecturerImageId = lecturerImageIdNew;
    }

    @Override
    public int getCount() {
        return nameOfLecturers.length;
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
        View directors;

        LayoutInflater layoutInflaterList = (LayoutInflater) context1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            directors = new View(context1);
            directors = layoutInflaterList.inflate(R.layout.directory_list_row_item, null);
            TextView textView = (TextView) directors.findViewById(R.id.nameOfLecturer);
            TextView viewText = (TextView) directors.findViewById(R.id.emailo);
            TextView textViewPhone = (TextView) directors.findViewById(R.id.phoneNumo);
            TextView viewTextDesignation = (TextView) directors.findViewById(R.id.designation);
            TextView textViewdepartment = (TextView) directors.findViewById(R.id.department);

            ImageView imageViewLecturer = (ImageView) directors.findViewById(R.id.list_image_lecturer);

            textView.setText(nameOfLecturers[position]);
            viewText.setText(emails[position]);
            textViewPhone.setText(phoneNumb[position]);
            viewTextDesignation.setText(designations[position]);
            textViewdepartment.setText(departments[position]);
            imageViewLecturer.setImageResource(lecturerImageId[position]);
        }else {
            directors = (View) convertView;
        }
        return directors;
    }
}
